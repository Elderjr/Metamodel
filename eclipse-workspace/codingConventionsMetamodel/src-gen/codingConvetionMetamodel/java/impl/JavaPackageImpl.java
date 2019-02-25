/**
 */
package codingConvetionMetamodel.java.impl;

import codingConvetionMetamodel.CodingConventionsMetamodelPackage;

import codingConvetionMetamodel.elements.ElementsPackage;

import codingConvetionMetamodel.elements.datatype.DatatypePackage;

import codingConvetionMetamodel.elements.datatype.impl.DatatypePackageImpl;

import codingConvetionMetamodel.elements.impl.ElementsPackageImpl;

import codingConvetionMetamodel.elements.namedElements.NamedElementsPackage;

import codingConvetionMetamodel.elements.namedElements.impl.NamedElementsPackageImpl;

import codingConvetionMetamodel.elements.statements.StatementsPackage;

import codingConvetionMetamodel.elements.statements.impl.StatementsPackageImpl;

import codingConvetionMetamodel.filters.FiltersPackage;

import codingConvetionMetamodel.filters.impl.FiltersPackageImpl;

import codingConvetionMetamodel.impl.CodingConventionsMetamodelPackageImpl;

import codingConvetionMetamodel.java.InstanceOf;
import codingConvetionMetamodel.java.JCatchClause;
import codingConvetionMetamodel.java.JClass;
import codingConvetionMetamodel.java.JConstructor;
import codingConvetionMetamodel.java.JElement;
import codingConvetionMetamodel.java.JFor;
import codingConvetionMetamodel.java.JInterface;
import codingConvetionMetamodel.java.JMethod;
import codingConvetionMetamodel.java.JReturnStatement;
import codingConvetionMetamodel.java.JTryCatch;
import codingConvetionMetamodel.java.JTryClause;
import codingConvetionMetamodel.java.JavaFactory;
import codingConvetionMetamodel.java.JavaPackage;
import codingConvetionMetamodel.java.ThrowStatement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaPackageImpl extends EPackageImpl implements JavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jTryCatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jTryClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jCatchClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jForEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jReturnStatementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see codingConvetionMetamodel.java.JavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaPackageImpl() {
		super(eNS_URI, JavaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaPackage init() {
		if (isInited)
			return (JavaPackage) EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Obtain or create and register package
		JavaPackageImpl theJavaPackage = (JavaPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new JavaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CodingConventionsMetamodelPackageImpl theCodingConventionsMetamodelPackage = (CodingConventionsMetamodelPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CodingConventionsMetamodelPackage.eNS_URI) instanceof CodingConventionsMetamodelPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CodingConventionsMetamodelPackage.eNS_URI)
						: CodingConventionsMetamodelPackage.eINSTANCE);
		ElementsPackageImpl theElementsPackage = (ElementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ElementsPackage.eNS_URI) instanceof ElementsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI)
						: ElementsPackage.eINSTANCE);
		NamedElementsPackageImpl theNamedElementsPackage = (NamedElementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(NamedElementsPackage.eNS_URI) instanceof NamedElementsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(NamedElementsPackage.eNS_URI)
						: NamedElementsPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI)
						: StatementsPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI)
						: DatatypePackage.eINSTANCE);
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI)
						: FiltersPackage.eINSTANCE);

		// Create package meta-data objects
		theJavaPackage.createPackageContents();
		theCodingConventionsMetamodelPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theNamedElementsPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theFiltersPackage.createPackageContents();

		// Initialize created meta-data
		theJavaPackage.initializePackageContents();
		theCodingConventionsMetamodelPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theNamedElementsPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, theJavaPackage);
		return theJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJElement() {
		return jElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJClass() {
		return jClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_NestedClasses() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Implements() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Blocks() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJInterface() {
		return jInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJMethod() {
		return jMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethod_Throws() {
		return (EReference) jMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJConstructor() {
		return jConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJTryCatch() {
		return jTryCatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTryCatch_Try() {
		return (EReference) jTryCatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTryCatch_Catches() {
		return (EReference) jTryCatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJTryClause() {
		return jTryClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTryClause_Resources() {
		return (EReference) jTryClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJCatchClause() {
		return jCatchClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJCatchClause_Exceptions() {
		return (EReference) jCatchClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJCatchClause_Param() {
		return (EReference) jCatchClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceOf() {
		return instanceOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowStatement() {
		return throwStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowStatement_Throws() {
		return (EReference) throwStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJFor() {
		return jForEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJFor_Initializers() {
		return (EReference) jForEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJFor_Updaters() {
		return (EReference) jForEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJReturnStatement() {
		return jReturnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFactory getJavaFactory() {
		return (JavaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		jElementEClass = createEClass(JELEMENT);

		jClassEClass = createEClass(JCLASS);
		createEReference(jClassEClass, JCLASS__NESTED_CLASSES);
		createEReference(jClassEClass, JCLASS__IMPLEMENTS);
		createEReference(jClassEClass, JCLASS__BLOCKS);

		jInterfaceEClass = createEClass(JINTERFACE);

		jMethodEClass = createEClass(JMETHOD);
		createEReference(jMethodEClass, JMETHOD__THROWS);

		jConstructorEClass = createEClass(JCONSTRUCTOR);

		jTryCatchEClass = createEClass(JTRY_CATCH);
		createEReference(jTryCatchEClass, JTRY_CATCH__TRY);
		createEReference(jTryCatchEClass, JTRY_CATCH__CATCHES);

		jTryClauseEClass = createEClass(JTRY_CLAUSE);
		createEReference(jTryClauseEClass, JTRY_CLAUSE__RESOURCES);

		jCatchClauseEClass = createEClass(JCATCH_CLAUSE);
		createEReference(jCatchClauseEClass, JCATCH_CLAUSE__EXCEPTIONS);
		createEReference(jCatchClauseEClass, JCATCH_CLAUSE__PARAM);

		instanceOfEClass = createEClass(INSTANCE_OF);

		throwStatementEClass = createEClass(THROW_STATEMENT);
		createEReference(throwStatementEClass, THROW_STATEMENT__THROWS);

		jForEClass = createEClass(JFOR);
		createEReference(jForEClass, JFOR__INITIALIZERS);
		createEReference(jForEClass, JFOR__UPDATERS);

		jReturnStatementEClass = createEClass(JRETURN_STATEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NamedElementsPackage theNamedElementsPackage = (NamedElementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(NamedElementsPackage.eNS_URI);
		StatementsPackage theStatementsPackage = (StatementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(StatementsPackage.eNS_URI);

		// Add supertypes to classes
		jClassEClass.getESuperTypes().add(theNamedElementsPackage.getComplexType());
		jClassEClass.getESuperTypes().add(this.getJElement());
		jInterfaceEClass.getESuperTypes().add(this.getJElement());
		jInterfaceEClass.getESuperTypes().add(theNamedElementsPackage.getComplexType());
		jMethodEClass.getESuperTypes().add(theNamedElementsPackage.getMethod());
		jConstructorEClass.getESuperTypes().add(this.getJMethod());
		jTryCatchEClass.getESuperTypes().add(this.getJElement());
		jTryClauseEClass.getESuperTypes().add(theStatementsPackage.getBlock());
		jCatchClauseEClass.getESuperTypes().add(theStatementsPackage.getBlock());
		instanceOfEClass.getESuperTypes().add(this.getJElement());
		instanceOfEClass.getESuperTypes().add(theStatementsPackage.getStatement());
		instanceOfEClass.getESuperTypes().add(theStatementsPackage.getInfixExp());
		throwStatementEClass.getESuperTypes().add(this.getJElement());
		jForEClass.getESuperTypes().add(theStatementsPackage.getBlock());
		jForEClass.getESuperTypes().add(this.getJElement());
		jForEClass.getESuperTypes().add(theStatementsPackage.getLoopControl());
		jReturnStatementEClass.getESuperTypes().add(this.getJElement());
		jReturnStatementEClass.getESuperTypes().add(theStatementsPackage.getStatement());

		// Initialize classes and features; add operations and parameters
		initEClass(jElementEClass, JElement.class, "JElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jClassEClass, JClass.class, "JClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJClass_NestedClasses(), this.getJClass(), null, "nestedClasses", null, 0, -1, JClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Implements(), this.getJInterface(), null, "implements", null, 0, -1, JClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Blocks(), theStatementsPackage.getBlock(), null, "blocks", null, 0, -1, JClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jInterfaceEClass, JInterface.class, "JInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jMethodEClass, JMethod.class, "JMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJMethod_Throws(), this.getJClass(), null, "throws", null, 0, -1, JMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(jConstructorEClass, JConstructor.class, "JConstructor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jTryCatchEClass, JTryCatch.class, "JTryCatch", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJTryCatch_Try(), this.getJTryClause(), null, "try", null, 0, 1, JTryCatch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJTryCatch_Catches(), this.getJCatchClause(), null, "catches", null, 0, -1, JTryCatch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jTryClauseEClass, JTryClause.class, "JTryClause", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJTryClause_Resources(), theStatementsPackage.getStatement(), null, "resources", null, 0, -1,
				JTryClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jCatchClauseEClass, JCatchClause.class, "JCatchClause", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJCatchClause_Exceptions(), this.getJClass(), null, "exceptions", null, 0, -1,
				JCatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJCatchClause_Param(), theNamedElementsPackage.getVariable(), null, "param", null, 0, 1,
				JCatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceOfEClass, InstanceOf.class, "InstanceOf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(throwStatementEClass, ThrowStatement.class, "ThrowStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThrowStatement_Throws(), theStatementsPackage.getAccess(), null, "throws", null, 0, 1,
				ThrowStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jForEClass, JFor.class, "JFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJFor_Initializers(), theStatementsPackage.getStatement(), null, "initializers", null, 0, -1,
				JFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJFor_Updaters(), theStatementsPackage.getStatement(), null, "updaters", null, 0, -1,
				JFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jReturnStatementEClass, JReturnStatement.class, "JReturnStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //JavaPackageImpl