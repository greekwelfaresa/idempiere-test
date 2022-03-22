package au.org.greekwelfaresa.idempiere.test.assertj;

import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration;

// Dummy class to force Bnd to generate an import for RecursiveComparisonConfiguration
// (needed by generated soft assertions). This class should become unnecessary
// from AssertJ 3.17.0
class Import {

	Class<?> importRecursive = RecursiveComparisonConfiguration.class;
	
}
