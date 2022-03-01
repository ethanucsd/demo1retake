import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class myFileTester {
    @Test
    public void testMyFileTester() {
        assertEquals(3, myFile.calc(1));
    }
}
