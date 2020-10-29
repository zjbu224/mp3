package jenkins.model;
import jenkins.model.IdStrategy.CaseSensitive;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class test {
	CaseSensitive casesens = new CaseSensitive();
    @Test public void t1(){
    	assertEquals (casesens.idFromFilename("file$"), "file");
    }
    @Test public void t2(){
    	assertEquals (casesens.idFromFilename("file"), "file");
    }
}