package desmoj.core.report;

import desmoj.core.simulator.TimeOperations;
import desmoj.core.simulator.TimeSpan;

/**
 * Captures all relevant information about the Accumulate.
 * 
 * @version DESMO-J, Ver. 2.2.0 copyright (c) 2010
 * @author Soenke Claassen based on ideas from Tim Lechler
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

public class AccumulateReporter extends desmoj.core.report.Reporter {

	// ****** methods ******

	/**
	 * Constructor for a new AccumulateReporter. Note that although any
	 * Reportable is accepted you should make sure that only subtypes of
	 * Accumulate are passed to this constructor. Otherwise the number of column
	 * titles and their individual headings will differ from the actual content
	 * collected by this reporter.
	 * 
	 * @param informationSource
	 *            desmoj.Reportable : The Accumulate to report about.
	 */
	public AccumulateReporter(desmoj.core.simulator.Reportable informationSource) {
		super(informationSource); // make a Reporter (source =
		// informationSource)

		numColumns = 7;
		columns = new String[numColumns];
		columns[0] = "Title";
		columns[1] = "(Re)set";
		columns[2] = "Obs";
		columns[3] = "Mean";
		columns[4] = "Std.Dev";
		columns[5] = "Min";
		columns[6] = "Max";
		groupHeading = "Accumulates";
		groupID = 1711; // see Reporter for more information about groupID
		entries = new String[numColumns];
	}

	/**
	 * Returns an array of Strings each containing the data for the
	 * corresponding column in array <code>columns[]</code>. Implement this
	 * method in a way, that an array of the same length as the columntitles is
	 * produced containing the data at the point of time this method is called
	 * by someone else to produce up-to-date information.
	 * 
	 * @return java.lang.String[] : Array containing the data for reporting
	 */
	public String[] getEntries() {
		if (source instanceof desmoj.core.statistic.Accumulate) {
			// the Accumulate we report about (source = informationSource)
			desmoj.core.statistic.Accumulate acc = (desmoj.core.statistic.Accumulate) source;

			// Title
			entries[0] = acc.getName();
			// (Re)set
			entries[1] = acc.resetAt().toString();
			// Obs
			entries[2] = Long.toString(acc.getObservations());

			// Mean
			// has no time passed since the last reset?
			if (TimeSpan.isEqual(TimeOperations
					.diff(acc.presentTime(), acc.resetAt()),TimeSpan.ZERO)
					|| acc.getObservations() == 0) // OR no observations are
			// made
			{
				entries[3] = "insufficient data";
			} else // return mean value
			{
				entries[3] = Double.toString(acc.getMean());
			}

			// Std.Dev

			// has no time passed since the last reset?
			if (TimeSpan.isEqual(TimeOperations
					.diff(acc.presentTime(), acc.resetAt()),TimeSpan.ZERO)
					|| acc.getObservations() < 2) // OR not enough
			// observations
			// are made
			{
				entries[4] = "insufficient data";
			} else // return mean value
			{
				entries[4] = Double.toString(acc.getStdDev());
			}

			// Min.
			entries[5] = Double.toString(acc.getMinimum());
			// Max
			entries[6] = Double.toString(acc.getMaximum());
		} else {
			for (int i = 0; i < numColumns; i++) {
				entries[i] = "Invalid source!";
			} // end for
		} // end else

		return entries;
	}
} // end class AccumulateReporter
