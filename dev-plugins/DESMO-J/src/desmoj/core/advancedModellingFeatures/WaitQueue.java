package desmoj.core.advancedModellingFeatures;

import desmoj.core.simulator.Condition;
import desmoj.core.simulator.ProcessQueue;
import desmoj.core.simulator.QueueBased;
import desmoj.core.simulator.QueueList;
import desmoj.core.simulator.QueueListFifo;
import desmoj.core.simulator.SimProcess;
import desmoj.core.simulator.TimeInstant;
import desmoj.core.simulator.TimeSpan;

/**
 * The WaitQueue is used to synchronize the cooperation of two processes. One
 * process (the master) has the leading role and is performing the cooperation
 * while the other process (the slave) is passive during this period. The slave
 * will be activated again after the cooperation is done. The master process is
 * calling <code>cooperate()</code> to signal that it is willing to cooperate as
 * a master. Slaves are calling <code>waitOnCoop()</code>. The action performed
 * during the cooperation of the two processes has to be implemented in the
 * method <code>cooperation()</code> in the class <code>ProcessCoop</code>.
 * There are two waiting queues, one for the masters and one for the slaves. If
 * there is no corresponding master or slave available, they are inserted in a
 * such a waiting queue.
 * 
 * WaitQueue is encapsulating the queue for the master processes and has a
 * reference to a ProcessQueue where the slaves are waiting.
 * 
 * The first sort criteria for the queues is always highest priorities first,
 * the second queueing discipline of the underlying queues and the capacity
 * limit can be determined by the user (default is Fifo and unlimited capacity).
 * WaitQueue is derived from QueueBased, which provides all the statistical
 * functionality for a queue.
 * 
 * @see desmoj.core.simulator.QueueBased
 * @see desmoj.core.advancedModellingFeatures.ProcessCoop
 * 
 * @version DESMO-J, Ver. 2.2.0 copyright (c) 2010
 * @author Soenke Claassen
 * @author based on DESMO-C from Thomas Schniewind, 1998
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */

public class WaitQueue extends desmoj.core.simulator.QueueBased {

	// ****** attributes ******

	/**
	 * The queue, actually storing the master processes waiting for slaves to
	 * cooperate with
	 */
	protected QueueList masterQueue;

	/**
	 * The queue, actually storing the slave processes. Can contain processes
	 * only!
	 */
	protected ProcessQueue slaveQueue;

	/**
	 * Counter for the SimProcesses which are refused to be enqueued in the
	 * master queue, because the queue capacity is full.
	 */
	protected long mRefused;

	/**
	 * Counter for the SimProcesses which are refused to be enqueued in the
	 * slave queue, because the queue capacity is full.
	 */
	protected long sRefused;

	/**
	 * Indicates the method where something has gone wrong. Is passed as a
	 * parameter to the methods <code>checkProcess()</code> and
	 * <code>checkCondition</code>.
	 */
	protected String where;

	// ****** methods ******

	/**
	 * Constructor for a WaitQueue. Actually there are two waiting queues
	 * constructed, one internal <code>QueueList</code> for the masters and one
	 * separate <code>ProcessQueue</code> for the slave processes. The queueing
	 * discipline and the capacity limit of the underlying queues can be chosen.
	 * Highest priority are always first in the queues.
	 * 
	 * @param owner
	 *            Model : The model this WaitQueue is associated to.
	 * @param name
	 *            java.lang.String : The WaitQueue's name
	 * @param mSortOrder
	 *            int : determines the sort order of the underlying master queue
	 *            implementation. Choose a constant from <code>QueueBased</code>
	 *            like <code>QueueBased.FIFO</code> or
	 *            <code>QueueBased.LIFO</code> or ...
	 * @param mQCapacity
	 *            int : The capacity of the master queue, that is how many
	 *            processes can be enqueued. Zero (0) means unlimited capacity.
	 * @param sSortOrder
	 *            int : determines the sort order of the underlying slave queue
	 *            implementation. Choose a constant from <code>QueueBased</code>
	 *            like <code>QueueBased.FIFO</code> or
	 *            <code>QueueBased.LIFO</code> or ...
	 * @param sQCapacity
	 *            int : The capacity of the slave queue, that is how many
	 *            processes can be enqueued. Zero (0) means unlimited capacity.
	 * @param showInReport
	 *            boolean : Flag, if WaitQueue should produce a report or not.
	 * @param showInTrace
	 *            boolean : Flag for trace to produce trace messages.
	 */
	public WaitQueue(desmoj.core.simulator.Model owner, String name,
			int mSortOrder, int mQCapacity, int sSortOrder, int sQCapacity,
			boolean showInReport, boolean showInTrace) {
		// construct QueueBased
		super(owner, name + "_M", showInReport, showInTrace);

		// MASTER queue

		// check if a valid sortOrder is given for the master queue
		if (mSortOrder < 0) {
			sendWarning(
					"The given mSortOrder parameter is negative! "
							+ "A master queue with Fifo sort order will be created "
							+ "instead.",
					" Constructor of " + getClass().getName() + " : "
							+ getQuotedName() + ".",
					"A valid positive integer number must be provided to "
							+ "determine the sort order of the underlying queue.",
					"Make sure to provide a valid positive integer number "
							+ "by using the constants in the class QueueBased, like "
							+ "QueueBased.FIFO or QueueBased.LIFO.");
			// make a Fifo queue
			masterQueue = new QueueListFifo(); // better than nothing
			masterQueue.setQueueBased(this);
		} else {
			try {
				// determine the queueing strategy
				Class queueListStrategy = queueingStrategy[mSortOrder];

				masterQueue = (QueueList) queueListStrategy.newInstance();
			}

			catch (ArrayIndexOutOfBoundsException arrayExcept) {
				// the given sortOrder is not valid
				sendWarning(
						"The given mSortOrder parameter is not valid! "
								+ "A master queue with Fifo sort order will be created "
								+ "instead.",
						" Constructor of " + getClass().getName() + " : "
								+ getQuotedName() + ".",
						"A valid positive integer number must be provided to "
								+ "determine the sort order of the underlying queue.",
						"Make sure to provide a valid positive integer number "
								+ "by using the constants in the class QueueBased, like "
								+ "QueueBased.FIFO or QueueBased.LIFO.");
				// make a Fifo queue
				masterQueue = new QueueListFifo(); // better than nothing
			}

			catch (IllegalAccessException illAccExcept) {
				// the class to be loaded can not be found
				sendWarning(
						"IllegalAccessException: The class implementing the "
								+ "mSortOrder of the queue can not be found. A master "
								+ "queue with Fifo sort order will be created instead.",
						" Constructor of " + getClass().getName() + " : "
								+ getQuotedName() + ".",
						"Programm error when trying to create an instance of a "
								+ "class. Maybe the zero-argument constructor of that "
								+ "class can not be found",
						"Make sure to provide a valid positive integer number "
								+ "for the sort order by using the constants in the class "
								+ "QueueBased, like QueueBased.FIFO or QueueBased.LIFO. "
								+ "Contact one of the developers of DESMO-J!");
				// make a Fifo queue
				masterQueue = new QueueListFifo(); // better than nothing
			}

			catch (InstantiationException instExcept) {
				// no object of the given class can be instantiated
				sendWarning(
						"InstantiationException: No object of the given class "
								+ "can be instantiated! A master queue with Fifo sort "
								+ "order will be created instead.",
						" Constructor of " + getClass().getName() + " : "
								+ getQuotedName() + ".",
						"Programm error when trying to create an instance of a "
								+ "class. Maybe the the class is an interface or an "
								+ "abstract class that can not be instantiated",
						"Make sure to provide a valid positive integer number "
								+ "for the sort order by using the constants in the class "
								+ "QueueBased, like QueueBased.FIFO or QueueBased.LIFO. "
								+ "Contact one of the developers of DESMO-J!");
				// make a Fifo queue
				masterQueue = new QueueListFifo(); // better than nothing
			}

			// give the QueueList a reference to this QueueBased
			masterQueue.setQueueBased(this);
		}

		// set the capacity of the master queue
		queueLimit = mQCapacity;

		// check if the capacity does make sense
		if (mQCapacity < 0) {
			sendWarning("The given capacity of the master queue is negative! "
					+ "A master queue with unlimited capacity will be created "
					+ "instead.", " Constructor of " + getClass().getName()
					+ " : " + getQuotedName() + ".",
					"A negative capacity for a queue does not make sense.",
					"Make sure to provide a valid positive capacity "
							+ "for the underlying master queue.");
			// set the capacity to the maximum value
			queueLimit = Integer.MAX_VALUE;
		}

		// check if qCapacity is zero (that means unlimited capacity)
		if (mQCapacity == 0) {
			// set the capacity to the maximum value
			queueLimit = Integer.MAX_VALUE;
		}

		// SLAVE queue

		// the sort order of the slave queue
		int slaveQSortOrder = sSortOrder;

		// check if a valid sortOrder is given for the slave queue
		if (sSortOrder < 0 || sSortOrder >= queueingStrategy.length) {
			sendWarning(
					"The given sSortOrder parameter is negative or too big! "
							+ "A slave queue with Fifo sort order will be created "
							+ "instead.",
					" Constructor of " + getClass().getName() + " : "
							+ getQuotedName() + ".",
					"A valid positive integer number must be provided to "
							+ "determine the sort order of the underlying queue.",
					"Make sure to provide a valid positive integer number "
							+ "by using the constants in the class QueueBased, like "
							+ "QueueBased.FIFO or QueueBased.LIFO.");

			slaveQSortOrder = QueueBased.FIFO;
		}

		// set the capacity of the slave queue
		int slaveQLimit = sQCapacity;

		// check if the capacity does make sense
		if (sQCapacity < 0) {
			sendWarning("The given capacity of the slave queue is negative! "
					+ "A slave queue with unlimited capacity will be created "
					+ "instead.", " Constructor of " + getClass().getName()
					+ " : " + getQuotedName() + ".",
					"A negative capacity for a queue does not make sense.",
					"Make sure to provide a valid positive capacity "
							+ "for the underlying slave queue.");
			// set the capacity to the maximum value
			slaveQLimit = Integer.MAX_VALUE;
		}

		// make an actual slave queue with the right sort order and capacity
		// limit
		// but don't provide any extra report or trace for this "internal" queue
		slaveQueue = new ProcessQueue(owner, name + "_S", slaveQSortOrder,
				slaveQLimit, false, false);

		reset();
	}

	// ****** methods ******

	/**
	 * Constructor for a WaitQueue. Actually there are two waiting queues
	 * constructed, one internal <code>QueueList</code> for the masters and one
	 * separate <code>ProcessQueue</code> for the slave processes. Both queues
	 * have a FIFO sort order and no capacity limit.
	 * 
	 * @param owner
	 *            Model : The model this WaitQueue is associated to.
	 * @param name
	 *            java.lang.String : The WaitQueue's name
	 * @param showInReport
	 *            boolean : Flag, if WaitQueue should produce a report or not.
	 * @param showInTrace
	 *            boolean : Flag, if trace messages of this WaitQueue should be
	 *            displayed in the trace file.
	 */
	public WaitQueue(desmoj.core.simulator.Model owner, String name,
			boolean showInReport, boolean showInTrace) {
		// construct QueueBased
		super(owner, name + "_M", showInReport, showInTrace);

		// make an actual queue and give it a reference of this
		// "QueueBased"-WaitQueue for the masters to wait in
		masterQueue = new QueueListFifo();
		masterQueue.setQueueBased(this);

		// make an actual queue where we can store the slave processes but don't
		// provide any extra report or trace for this "internal" queue
		slaveQueue = new ProcessQueue(owner, name + "_S", false, false);

		reset();
	}

	/**
	 * Activates the SimProcess <code>process</code>, given as a parameter of
	 * this method, as the next process. This process should be a master process
	 * waiting in the master wait queue.
	 * 
	 * @param process
	 *            SimProcess : The process that is to be activated as next.
	 *            Should be a master process.
	 */
	protected void activateAsNext(SimProcess process) {
		where = "protected void activateAsNext(SimProcess process)";

		if (process != null) {
			if (!checkProcess(process, where)) // if process is not valid
			{
				return;
			} // just return

			if (process.isScheduled()) // different from DESMO, see DESMO-C
			{
				process.skipTraceNote(); // don't tell the user, that we ...
				process.cancel(); // get the process from the EventList
			}

			boolean wasBlocked = process.isBlocked();

			if (wasBlocked) {
				process.setBlocked(false); // the process is not blocked
				// anymore
				// and
			} // ready to become activated

			process.skipTraceNote(); // don't tell the user, that we ...
			process.activateAfter(current()); // activate process after the
			// current process

			if (wasBlocked) {
				process.setBlocked(true); // the process status is still
				// "blocked"
			} // end inner if
		} // end outer if
	} // end method

	/**
	 * Activates the first master process in the master waiting queue.
	 */
	protected void activateFirst() {
		where = "protected void activateFirst()";

		SimProcess mProcess = (SimProcess) masterQueue.first();

		if (mProcess != null) {
			if (!checkProcess(mProcess, where)) // if mProcess is not valid
			{
				return;
			} // just return

			if (mProcess.isScheduled()) // different from DESMO, see DESMO-C
			{
				mProcess.skipTraceNote(); // don't tell the user, that we ...
				mProcess.cancel(); // get the process from the EventList
			}

			boolean wasBlocked = mProcess.isBlocked();

			if (wasBlocked) {
				// the process is not blocked anymore and ready to become
				// activated
				mProcess.setBlocked(false);
			}

			mProcess.skipTraceNote(); // don't tell the user, that we ...
			mProcess.activateAfter(current()); // activate mProcess after the
			// current process

			if (wasBlocked) {
				mProcess.setBlocked(true); // the process status is still
				// "blocked"
			} // end inner if
		} // end outer if
	} // end method

	/**
	 * Returns the slave process waiting in the slave queue and complying to the
	 * given condition. If there is no such slave process waiting
	 * <code>null</code> is returned.
	 * 
	 * @return SimProcess : Returns the first slave process in the slave queue
	 *         which complies to the given condition.
	 * @param cond
	 *            Condition : The Condition <code>cond</code> is describing the
	 *            condition to which the slave process must comply to. This has
	 *            to be implemented by the user in the class:
	 *            <code>Condition</code> in the method: <code>check()</code>.
	 */
	public SimProcess avail(Condition cond) // different from DESMO-C !
	{
		where = "SimProcess avail(Condition cond)";

		// the current SimProcess which was calling cooperate() and from there
		// avail() is the master
		SimProcess master = currentSimProcess();

		if (!checkProcess(master, where)) // if master is not valid
		{
			return null;
		} // return null

		if (!checkCondition(cond, where)) // if the condition is not valid
		{
			return null;
		} // return null

		// the first slave complying to the condition or null
		SimProcess slave = slaveQueue.first(cond);

		return slave; // return the found slave (or null)
	} // end method

	/**
	 * Returns the master process waiting in the master queue and complying to
	 * the given condition. If there is no such master process waiting
	 * <code>null</code> is returned.
	 * 
	 * @return SimProcess : Returns the first master process in the master queue
	 *         which complies to the given condition.
	 * @param cond
	 *            Condition : The Condition <code>cond</code> is describing the
	 *            condition to which the master process must comply to. This has
	 *            to be implemented by the user in the class:
	 *            <code>Condition</code> in the method: <code>check()</code>.
	 */
	public SimProcess availMaster(Condition cond) // different from DESMO-C !
	{
		where = "SimProcess availMaster(Condition cond)";

		// the current SimProcess is assumed to be a slave looking for a master
		SimProcess slave = currentSimProcess();

		if (!checkProcess(slave, where)) // if master is not valid
		{
			return null;
		} // return null

		if (!checkCondition(cond, where)) // if the condition is not valid
		{
			return null;
		} // return null

		if (masterQueue.isEmpty()) // nobody home to be checked
		{
			return null;
		} // return null

		for (SimProcess master = (SimProcess) masterQueue.first(); master != null; master = (SimProcess) masterQueue
				.succ(master)) {
			if (cond.check(master))
				return master;
		}

		// if no SimProcess complies to the condition just return null
		return null;

	} // end method

	/**
	 * Checks whether the given condition is valid and compatible with the
	 * model.
	 * 
	 * @return boolean : Returns whether the Condition is valid or not.
	 * @param cond
	 *            Condition : Is this Condition a valid one?
	 * @param where
	 *            String : The String representation of the method where this
	 *            check takes place.
	 */
	protected boolean checkCondition(Condition cond, String where) {
		if (cond == null) // if cond is a null pointer instead of a condition
		{
			sendWarning("A non existing condition is used in a "
					+ getClass().getName() + "."
					+ "The attempted action is ignored!", getClass().getName()
					+ ": " + getQuotedName() + ", Method: " + where,
					"The condition is only a null pointer.",
					"Make sure that only real conditions are used to identify slave "
							+ "processes.");
			return false;
		}

		if (!isModelCompatible(cond)) // if cond is not modelcompatible
		{
			sendWarning(
					"The condition used to identify a slave process for a "
							+ "cooperation does not belong to this model. The attempted action is "
							+ "ignored!", getClass().getName() + ": "
							+ getQuotedName() + ", Method: " + where,
					"The condition is not modelcompatible.",
					"Make sure that conditions used to identify slave processes for a "
							+ "cooperation are belonging to the same model.");
			return false;
		}

		return true;
	}

	/**
	 * Checks whether the process trying to cooperate as a master or a slave is
	 * a valid SimProcess.
	 * 
	 * @return boolean : Returns whether the SimProcess is valid or not.
	 * @param p
	 *            SimProcess : Is this SimProcess a valid one?
	 * @param where
	 *            String : The String representation of the method where this
	 *            check takes place.
	 */
	protected boolean checkProcess(SimProcess p, String where) {
		if (p == null) // if p is a null pointer instead of a process
		{
			sendWarning("A non existing process is trying to cooperate with "
					+ "another process. The attempted action is ignored!",
					getClass().getName() + ": " + getQuotedName()
							+ ", Method: " + where,
					"The process is only a null pointer.",
					"Make sure that only real SimProcesses are trying to cooperate with "
							+ "each other.");
			return false;
		}

		if (!isModelCompatible(p)) // if p is not modelcompatible
		{
			sendWarning(
					"The SimProcess trying to cooperate with another process"
							+ " does not belong to this model. The attempted action is ignored!",
					getClass().getName() + ": " + getQuotedName()
							+ ", Method: " + where,
					"The process is not modelcompatible.",
					"Make sure that processes are cooperating only with processes "
							+ "belonging to the same model.");
			return false;
		}

		return true;
	}

	/**
	 * This method is to be called from a <code>SimProcess</code> which wants to
	 * cooperate as a master. If no suitable slave process is available at the
	 * moment, the master process will be stored in the master waiting queue,
	 * until a suitable slave is available. If the capacity limit of the master
	 * queue is reached, the process will not be enqueued and <code>false</code>
	 * returned. When a suitable slave is available its <code>cooperate</code>
	 * method (in the class <code>SimProcess</code>) will be called. During the
	 * cooperation the master process is the only active one. The slave process
	 * is passive and will be reactivated after the cooperation is done.
	 * 
	 * @return boolean : Is <code>true</code> if the process can be enqueued
	 *         successfully, <code>false</code> otherwise (i.e. capacity limit
	 *         of the master queue is reached).
	 * @param coop
	 *            ProcessCoop : The Process cooperation coop is describing the
	 *            joint action of the two processes. The action to be carried
	 *            out has to be implemented by the user in the class:
	 *            <code>ProcessCoop</code> in the method:
	 *            <code>cooperation()</code>.
	 */
	public boolean cooperate(ProcessCoop coop) {
		where = "boolean cooperate(ProcessCoop coop)";

		// check the ProcessCoop
		if (!isModelCompatible(coop)) {
			sendWarning(
					"The given ProcessCoop object does not "
							+ "belong to this model. The attempted cooperation is ignored!",
					getClass().getName() + ": " + getQuotedName()
							+ ", Method: " + where,
					"The ProcessCoop is not modelcompatible.",
					"Make sure that the process cooperation belongs to this model.");

			return false; // coop is not modelcompatible
		}

		// the current SimProcess which was calling cooperate() is the master
		SimProcess master = currentSimProcess();

		if (!checkProcess(master, where)) // if the master is no valid process
		{
			return false;
		} // just return false

		// check if capacity limit of master queue is reached
		if (queueLimit <= length()) {
			if (currentlySendDebugNotes()) { 
				sendDebugNote("refuses to insert "
						+ master.getQuotedName()
						+ " in master queue, because the capacity limit is reached.");
			}

			if (currentlySendTraceNotes()) {
				sendTraceNote("is refused to be enqueued in "
						+ this.getQuotedName()
						+ "'s master queue because the capacity limit ("
						+ getQueueLimit() + ") of the queue is reached");
			}

			mRefused++; // count the refused ones

			return false; // capacity limit is reached
		}

		// insert the master in its waiting queue
		masterQueue.insert(master);

		// check if the master has to wait in his queue
		if (slaveQueue.length() == 0 || // no slaves available OR
				master != (SimProcess) masterQueue.first()) // this master is
		// not
		{ // the first to be served
			if (currentlySendTraceNotes()) {
				sendTraceNote("waits in '" + this.getName() + "'");
			} // tell in the trace where the master is waiting

			if (slaveQueue.length() > 0) // there are slaves waiting
			{
				activateFirst(); // activate the first master in the
			} // queue to see what he can do

			do { // block the master process
				master.setBlocked(true); // as long as ...(see while)
				master.skipTraceNote(); // don't tell the user, that we
				master.passivate(); // passivate the master process
			} while (slaveQueue.length() <= 0); // ...no slaves are available
		}

		// the master has found a slave to cooperate with...

		// activate the successor of this master in the master wait queue
		activateAsNext((SimProcess) masterQueue.succ(master));

		masterQueue.remove(master); // remove this master from the wait queue
		master.setBlocked(false); // this master is not blocked anymore

		// get the first slave from its queue
		SimProcess slave = slaveQueue.first();

		if (!checkProcess(slave, where)) // if the slave process is not O.K.
		{
			return false;
		} // just return

		// prepare the slave for the cooperation
		slave.cooperate();

		// start the real cooperation with the slave
		coop.cooperation(master, slave);

		// the cooperation is over, so no master is controlling the slave
		// anymore
		slave.resetMaster();

		// the master is done with the cooperation, get the slave activated
		// after him
		slave.activateAfter(master);

		return true;
	}

	/**
	 * This method is called from a SimProcess which wants to cooperate as a
	 * master and is looking for a slave complying to a certain condition
	 * described in <code>cond</code>. If no suitable slave process with this
	 * condition is available at the moment, the master process will be stored
	 * in the master waiting queue, until a suitable slave is available. If the
	 * capacity limit of the master queue is reached, the process will not be
	 * enqueued and <code>false</code> returned. During the cooperation the
	 * master process is the only active one. The slave process is passive and
	 * will be reactivated after the cooperation is done.
	 * 
	 * @return boolean : Is <code>true</code> if the process can be enqueued
	 *         successfully, <code>false</code> otherwise (i.e. capacity limit
	 *         of the master queue is reached).
	 * @param coop
	 *            ProcessCoop : The Process cooperation coop is describing the
	 *            joint action of the two processes. This has to be implemented
	 *            by the user in the class: <code>ProcessCoop</code> in the
	 *            method: <code>cooperation</code>.
	 * @param cond
	 *            Condition : The Condition <code>cond</code> is describing the
	 *            condition to which the slave process must comply to. This has
	 *            to be implemented by the user in the class:
	 *            <code>Condition</code> in the method: <code>check()</code>.
	 */
	public boolean cooperate(ProcessCoop coop, Condition cond) {
		where = "boolean cooperate(ProcessCoop coop, Condition cond)";

		// check the ProcessCoop
		if (!isModelCompatible(coop)) {
			sendWarning(
					"The given ProcessCoop object does not "
							+ "belong to this model. The attempted cooperation is ignored!",
					getClass().getName() + ": " + getQuotedName()
							+ ", Method: " + where,
					"The ProcessCoop is not modelcompatible.",
					"Make sure that the process cooperation belongs to this model.");

			return false; // coop is not modelcompatible
		}

		// the current SimProcess which was calling cooperate() is the master
		SimProcess master = currentSimProcess();

		if (!checkProcess(master, where)) // if the master is no valid process
		{
			return false;
		} // just return false

		if (!checkCondition(cond, where)) // if the condition is not valid
		{
			return false;
		} // just return false

		// check if capacity limit of master queue is reached
		if (queueLimit <= length()) {
			if (currentlySendDebugNotes()) {
				sendDebugNote("refuses to insert "
						+ master.getQuotedName()
						+ " in master queue, because the capacity limit is reached.");
			}

			if (currentlySendTraceNotes()) {
				sendTraceNote("is refused to be enqueued in "
						+ this.getQuotedName()
						+ "'s master queue because the capacity limit ("
						+ getQueueLimit() + ") of the queue is reached");
			}

			mRefused++; // count the refused ones

			return false; // capacity limit is reached
		}

		masterQueue.insert(master); // insert the master in its waiting queue

		// see if there is suitable slave (if no slave is available: slave =
		// null)
		SimProcess slave = avail(cond);

		// check if the master has to wait in his queue
		if (slave == null || master != (SimProcess) masterQueue.first())
		// no slave with this condition is available OR
		// this master is not the first one in the queue
		{
			if (currentlySendTraceNotes()) {
				sendTraceNote("waits in '" + this.getName() + "' for '"
						+ cond.getName() + "' ");
			} // tell in the trace where the master is waiting and
			// on which condition

			if (slaveQueue.length() > 0 && // there are slaves waiting AND
					master != (SimProcess) masterQueue.first())
			// this master is not the first one in the queue
			{
				activateFirst(); // activate the first master in the
			} // queue to see what he can do

			do // infinite loop
			{ // block the master process
				master.setBlocked(true); // set blocked status to true
				master.skipTraceNote(); // don't tell the user, that we ...
				master.passivate(); // passivate the master process

				slave = avail(cond); // see if there is a suitable slave now

				if (slave != null) // a slave with the desired condition
				{
					break;
				} // is available -> break loop

				if (slaveQueue.length() > 0) // there are slaves waiting
				{
					activateAsNext((SimProcess) masterQueue.succ(master));
				} // activate the next master in the queue to see what he can
				// do
			} while (true); // end infinite loop
		}

		// A slave with a suitable Condition is found for cooperation

		if (!checkProcess(slave, where)) // if the slave process is not O.K.
		{
			return false;
		} // just return false

		// there are even more slaves waiting
		if (slaveQueue.length() > 1) {
			// activate the successor of this master in the master wait queue to
			// see what he can do
			activateAsNext((SimProcess) masterQueue.succ(master));
		}

		masterQueue.remove(master); // remove this master from the wait queue
		master.setBlocked(false); // this master is not blocked anymore

		if (currentlySendTraceNotes()) {
			// tell in the trace for which condition the master has found which
			// slave in which queue for which cooperation...
			sendTraceNote("finds " + cond.getQuotedName() + " "
					+ slave.getQuotedName() + " in "
					+ slaveQueue.getQuotedName() + " for "
					+ coop.getQuotedName());

			skipTraceNote(); // skip the trace note from the following
			// cooperate()
		}

		// prepare the slave for the cooperation
		slave.cooperate();

		// start the real cooperation with the slave
		coop.cooperation(master, slave);

		// the cooperation is over, so no master is controlling the slave
		// anymore
		slave.resetMaster();

		// the master is done with the cooperation, get the slave activated
		// after him
		slave.activateAfter(master);

		return true;
	}

	/**
	 * Returns a Reporter to produce a report about this WaitQueue.
	 * 
	 * @return desmoj.report.Reporter : The Reporter for the queues inside this
	 *         WaitQueue.
	 */
	public desmoj.core.report.Reporter createReporter() {
		return new desmoj.core.advancedModellingFeatures.report.WaitQueueReporter(
				this);
		// a reporter for the queue statistics
	}

	/**
	 * Returns the implemented queueing discipline of the underlying master
	 * queue as a String, so it can be displayed in the report.
	 * 
	 * @return String : The String indicating the queueing discipline.
	 */
	public String getMQueueStrategy() {

		return masterQueue.getAbbreviation(); // that's it
	}

	/**
	 * Returns the number of entities refused to be enqueued in the master
	 * queue, because the capacity limit is reached.
	 * 
	 * @return long : The number of entities refused to be enqueued in the
	 *         master queue.
	 */
	public long getMRefused() {

		return mRefused; // that's it
	}

	/**
	 * Returns the <code>ProcessQueue</code> where the waiting slaves are
	 * stored.
	 * 
	 * @return ProcessQueue : The <code>ProcessQueue</code> where the slaves are
	 *         waiting on masters to cooperate with.
	 */
	public ProcessQueue getSlaveQueue() {
		return this.slaveQueue;
	}

	/**
	 * Returns the implemented queueing discipline of the underlying slave queue
	 * as a String, so it can be displayed in the report.
	 * 
	 * @return String : The String indicating the queueing discipline.
	 */
	public String getSQueueStrategy() {

		return getSlaveQueue().getQueueStrategy(); // that's it!!
	}

	/**
	 * Returns the number of entities refused to be enqueued in the slave's
	 * queue, because the capacity limit is reached.
	 * 
	 * @return long : The number of entities refused to be enqueued in the
	 *         slave's queue.
	 */
	public long getSRefused() {

		return sRefused; // that's it
	}

	/**
	 * Returns the average length of the underlying master queue since the last
	 * reset. If the time span since the last reset is smaller than the smallest
	 * distinguishable timespan epsilon, the current length of the master queue
	 * will be returned.
	 * 
	 * @return double : The average master queue length since last reset or
	 *         current length of the master queue if no distinguishable periode
	 *         of time has passed.
	 */
	public double mAverageLength() {
		return averageLength(); // of the underlying QueueBased
	}

	/**
	 * Returns the average waiting time of all processes who have exited the
	 * master queue. Value is valid for the time span since the last reset.
	 * Returns 0 (zero) if no process have exited the master queue after the
	 * last reset.
	 * 
	 * @return TimeSpan : Average waiting time of all processes since last reset
	 *         or 0 if no process has exited the master queue
	 */
	public TimeSpan mAverageWaitTime() {
		return averageWaitTime(); // of the underlying QueueBased
	}

	// statistics of the underlying master queue

	/**
	 * Returns a boolean value indicating if the master queue is empty or if any
	 * number of simprocess is currently enqueued in it.
	 * 
	 * @return boolean : Is <code>true</code> if the master queue is empty,
	 *         <code>false</code> otherwise
	 */
	public boolean mIsEmpty() {
		return masterQueue.isEmpty(); // of the underlying QueueList
	}

	/**
	 * Returns the current length of the master queue.
	 * 
	 * @return long : The current master queue length
	 */
	public long mLength() {
		return length(); // of the underlying QueueBased
	}

	/**
	 * Returns the maximum length of the underlying master queue since the last
	 * reset.
	 * 
	 * @return long : The maximum master queue length since the last reset.
	 */
	public long mMaxLength() {
		return maxLength(); // of the underlying QueueBased
	}

	/**
	 * Returns the point of simulation time with the maximum number of processes
	 * waiting inside the underlying master queue. The value is valid for the
	 * period since the last reset.
	 * 
	 * @return desmoj.TimeInstant : Point of time with maximum master queue length
	 *         since the last reset.
	 */
	public TimeInstant mMaxLengthAt() {
		return maxLengthAt(); // of the underlying QueueBased
	}

	/**
	 * Returns the maximum duration in simulation time that an process has spent
	 * waiting inside the underlying master queue. The value is valid for the
	 * period since the last reset.
	 * 
	 * @return desmoj.TimeSpan : Longest waiting time of a process in the master
	 *         queue since the last reset.
	 */
	public TimeSpan mMaxWaitTime() {
		return maxWaitTime(); // of the underlying QueueBased
	}

	/**
	 * Returns the point of simulation time when the process with the maximum
	 * waiting time exited the underlying master queue. The value is valid for
	 * the period since the last reset.
	 * 
	 * @return desmoj.TimeInstant : The point of simulation time when the process
	 *         with the maximum waiting time exited the master queue.
	 */
	public TimeInstant mMaxWaitTimeAt() {
		return maxWaitTimeAt(); // of the underlying QueueBased
	}

	/**
	 * Returns the minimumn length of the underlying master queue since the last
	 * reset.
	 * 
	 * @return long : The minimum master queue length since the last reset.
	 */
	public long mMinLength() {
		return minLength(); // of the underlying QueueBased
	}

	/**
	 * Returns the point of simulation time with the minimum number of processes
	 * waiting inside the underlying master queue. The value is valid for the
	 * period since the last reset.
	 * 
	 * @return desmoj.TimeInstant : Point of time with minimum master queue length
	 *         since the last reset.
	 */
	public TimeInstant mMinLengthAt() {
		return minLengthAt(); // of the underlying QueueBased
	}

	/**
	 * Returns the standard deviation of the master queue's length. Value is
	 * weighted over time.
	 * 
	 * @return double : The standard deviation for the master queue's length
	 *         weighted over time.
	 */
	public double mStdDevLength() {
		return stdDevLength(); // of the underlying QueueBased
	}

	/**
	 * Returns the standard deviation of the master queue's processes waiting
	 * times.
	 * 
	 * @return TimeSpan : The standard deviation for the master queue's processes
	 *         waiting times.
	 */
	public TimeSpan mStdDevWaitTime() {
		return stdDevWaitTime(); // of the underlying QueueBased
	}

	/**
	 * Returns the number of processes that have passed through the master queue
	 * without spending time waiting.
	 * 
	 * @return long : The number of processes who have passed the master queue
	 *         without waiting
	 */
	public long mZeroWaits() {
		return zeroWaits(); // of the underlying QueueBased
	}

	/**
	 * Resets all statistical counters to their default values. Both, master
	 * queue and slave queue are reset. The mininum and maximum length of the
	 * queues are set to the current number of queued objects.
	 */
	public void reset() {
		super.reset(); // reset of the QueueBased master queue

		slaveQueue.reset(); // reset of the slave queue (based on ProcessQueue)

		mRefused = 0; // reset the statistics of the refused processes
		sRefused = 0;
	}

	/**
	 * Returns the average length of the slave queue since the last reset. If
	 * the time span since the last reset is smaller than the smallest
	 * distinguishable timespan epsilon, the current length of the slave queue
	 * will be returned.
	 * 
	 * @return double : The average slave queue length since last reset or
	 *         current length of the slave queue if no distinguishable periode
	 *         of time has passed.
	 */
	public double sAverageLength() {
		return slaveQueue.averageLength(); // of the slave ProcessQueue
	}

	/**
	 * Returns the average waiting time of all processes who have exited the
	 * slave queue. Value is valid for the time span since the last reset.
	 * Returns 0 (zero) if no process have exited the slave queue after the last
	 * reset.
	 * 
	 * @return TimeSpan : Average waiting time of all processes since last reset
	 *         or 0 if no process has exited the slave queue
	 */
	public TimeSpan sAverageWaitTime() {
		return slaveQueue.averageWaitTime(); // of the slave ProcessQueue
	}

	// statistics of the slave queue

	/**
	 * Returns a boolean value indicating if the slave queue is empty or if any
	 * number of simprocess is currently enqueued in it.
	 * 
	 * @return boolean : Is <code>true</code> if the slave queue is empty,
	 *         <code>false</code> otherwise
	 */
	public boolean sIsEmpty() {
		return slaveQueue.isEmpty(); // of the slave ProcessQueue
	}

	/**
	 * Returns the current length of the slave queue.
	 * 
	 * @return long : The current slave queue length.
	 */
	public long sLength() {
		return slaveQueue.length(); // of the slave ProcessQueue
	}

	/**
	 * Returns the maximum length of the slave queue since the last reset.
	 * 
	 * @return long : The maximum slave queue length since the last reset.
	 */
	public long sMaxLength() {
		return slaveQueue.maxLength(); // of the slave ProcessQueue
	}

	/**
	 * Returns the point of simulation time with the maximum number of processes
	 * waiting inside the slave queue. The value is valid for the period since
	 * the last reset.
	 * 
	 * @return desmoj.TimeInstant : Point of time with maximum slave queue length
	 *         since the last reset.
	 */
	public TimeInstant sMaxLengthAt() {
		return slaveQueue.maxLengthAt(); // of the slave ProcessQueue
	}

	/**
	 * Returns the maximum duration in simulation time that an process has spent
	 * waiting inside the slave queue. The value is valid for the period since
	 * the last reset.
	 * 
	 * @return desmoj.TimeSpan : Longest waiting time of a process in the slave
	 *         queue since the last reset.
	 */
	public TimeSpan sMaxWaitTime() {
		return slaveQueue.maxWaitTime(); // of the slave ProcessQueue
	}

	/**
	 * Returns the point of simulation time when the process with the maximum
	 * waiting time exited the slave queue. The value is valid for the period
	 * since the last reset.
	 * 
	 * @return desmoj.TimeInstant : The point of simulation time when the process
	 *         with the maximum waiting time exited the slave queue.
	 */
	public TimeInstant sMaxWaitTimeAt() {
		return slaveQueue.maxWaitTimeAt(); // of the slave ProcessQueue
	}

	/**
	 * Returns the minimumn length of the slave queue since the last reset.
	 * 
	 * @return long : The minimum slave queue length since the last reset.
	 */
	public long sMinLength() {
		return slaveQueue.minLength(); // of the slave ProcessQueue
	}

	/**
	 * Returns the point of simulation time with the minimum number of processes
	 * waiting inside the slave queue. The value is valid for the period since
	 * the last reset.
	 * 
	 * @return desmoj.TimeInstant : Point of time with minimum slave queue length
	 *         since the last reset.
	 */
	public TimeInstant sMinLengthAt() {
		return slaveQueue.minLengthAt(); // of the slave ProcessQueue
	}

	/**
	 * Returns the standard deviation of the slave queue's length. Value is
	 * weighted over time.
	 * 
	 * @return double : The standard deviation for the slave queue's length
	 *         weighted over time.
	 */
	public double sStdDevLength() {
		return slaveQueue.stdDevLength(); // of the slave ProcessQueue
	}

	/**
	 * Returns the standard deviation of the slave queue's processes waiting
	 * times.
	 * 
	 * @return TimeSpan : The standard deviation for the slave queue's processes
	 *         waiting times.
	 */
	public TimeSpan sStdDevWaitTime() {
		return slaveQueue.stdDevWaitTime(); // of the slave ProcessQueue
	}

	/**
	 * Returns the number of processes that have passed through the slave queue
	 * without spending time waiting.
	 * 
	 * @return long : The number of processes who have passed the slave queue
	 *         without waiting
	 */
	public long sZeroWaits() {
		return slaveQueue.zeroWaits(); // of the slave ProcessQueue
	}

	/**
	 * This method is called from a SimProcess which wants to cooperate as a
	 * slave. If no suitable master process is available at the moment, the
	 * slave process will be stored in the slave queue, until a suitable master
	 * is available. If the capacity limit of the slave queue is reached, the
	 * process will not be enqueued and <code>false</code> returned. During the
	 * cooperation the master process is the only active one. The slave process
	 * is passive and will be reactivated after the cooperation is done.
	 * 
	 * @return boolean : Is <code>true</code> if the process can be enqueued
	 *         successfully, <code>false</code> otherwise (i.e. capacity limit
	 *         of the slave queue is reached).
	 */
	public boolean waitOnCoop() // wait() is a final method in java.lang.Object
	{
		where = "boolean waitOnCoop ()";

		// the current process calling the waitOnCoop()-method is the slave
		SimProcess slave = currentSimProcess();

		if (!checkProcess(slave, where)) // if the slave is not a valid
		// process
		{
			return false;
		} // just return false

		if (slave.getSlaveWaitQueue() != null) // the slave process is already
		{ // waiting for a master
			sendWarning(
					"A slave process already waiting in the slave waiting "
							+ "queue: "
							+ slave.getSlaveWaitQueue().getName()
							+ " is trying to initiate a second cooperation. The attempted second "
							+ "cooperation is ignored!",
					getClass().getName() + ": " + getQuotedName()
							+ ", Method: " + where,
					"The slave process can not wait in more than one waiting queue.",
					"Make sure that slave processes are only cooperating with one master "
							+ "at a time.");
			return false; // ignore the second cooperation, just return false.
		}

		// check if capacity limit of slave queue is reached
		if (slaveQueue.getQueueLimit() <= slaveQueue.length()) {

			if (currentlySendDebugNotes()) {
				sendDebugNote("refuses to insert "
						+ slave.getQuotedName()
						+ " in slave queue, because the capacity limit is reached.");
			}

			if (currentlySendTraceNotes()) {
				sendTraceNote("is refused to be enqueued in "
						+ this.getQuotedName()
						+ "'s slave queue because the capacity limit ("
						+ slaveQueue.getQueueLimit()
						+ ") of the queue is reached");
			}

			sRefused++; // count the refused ones

			return false; // capacity limit is reached
		}

		slaveQueue.insert(slave); // insert the slave process in the waitqueue

		slave.setSlaveWaitQueue(slaveQueue); // tell the SimProcess where he
		// is waiting. Will be reset in SimProcess.cooperate(), when the
		// master is leading the slave through the cooperation.

		if (currentlySendTraceNotes()) // tell in the trace where the slave is
										// waiting
		{
			sendTraceNote("waits in " + slaveQueue.getQuotedName());
		}

		// are there masters already waiting?
		if (length() > 0) {
			activateFirst(); // activate the first master in the queue
		}

		slave.setBlocked(true); // the slave process is blocked (in the wq)
		slave.skipTraceNote(); // don't tell the user, that we ...
		slave.passivate(); // passivate the slave process

		return true; // cooperation performed successfully
	}
} // end class WaitQueue
