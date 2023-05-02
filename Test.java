import javax.script.*;
import java.util.*;
import org.openjdk.nashorn.api.scripting.ScriptObjectMirror;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        test();
    }

    /** Attempts to run a script using a script engine. */
    public static void test() throws Exception
    {
        String script = null;
        ScriptEngine se = null;        

        script = """
(function() {        
    function myProc() {
        print("Hello from Nashorn!");
    }

    function greet() {
        var Helper = Java.type('Helper');
        var h = new Helper;
        
        h.test();
        
        return myProc;
    }      
                  
    return greet();
})();
""";
                
        se = new ScriptEngineManager().getEngineByName("nashorn");
        
        // try using our Helper class from within the script.
        // then try calling the function it returns.
        try {
            Object result = se.eval(script);
            ScriptObjectMirror m = (ScriptObjectMirror)result;
            m.call(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
