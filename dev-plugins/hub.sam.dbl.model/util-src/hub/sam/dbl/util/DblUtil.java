package hub.sam.dbl.util;

import hub.sam.dbl.DblFactory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class DblUtil {

	public static EObject createObjectOfParentClass(EClass metaClass) {
		System.out.print("trying to create meta-class for " + metaClass.getName() + " dynamically ... ");

		EObjectImpl instance = null;
		try {
			EClass parentClass = metaClass.getESuperTypes().get(0);
			System.out.println();
			System.out.print("instantiating " + parentClass.getName() + " ");
			if (metaClass.getESuperTypes().size() > 1) {
				System.out.print("-- warning: multiple parent meta-classes exist, instantiating the first one");
			}
			instance = (EObjectImpl) DblFactory.eINSTANCE.create(parentClass);
			instance.eSetClass(metaClass);
			System.out.println(" -- ok");
		}
		finally {
			if (instance == null) {
				System.out.println(" -- failed");
			}
		}
		
		return instance;
	}
	
}
