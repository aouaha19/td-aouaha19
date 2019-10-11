package fr.dauphine.ja.aouamehafsa.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PrimeCollectionTest extends TestCase {

	    /**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     */
		 public PrimeCollectionTest(String testName )
		    {
		        super( testName );
		    }

	    /**
	     * @return the suite of tests being tested
	     */
	    public static Test suite()
	    {
	        return new TestSuite( PrimeCollectionTest.class );
	    }

	    /**
	     * Rigourous Test :-)
	     */
	    public void testApp()
	    {
	        assertTrue( true );
	    }
	    
	    public static void main (String[] args){
			PrimeCollection pc= new PrimeCollection();
			pc.initRandom(100,1000);
			pc.printPrimes();
			pc.initRandom(1,1);
			pc.printPrimes();
		}
}

