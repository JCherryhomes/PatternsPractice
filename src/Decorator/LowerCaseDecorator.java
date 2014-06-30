package Decorator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Scanner;

/**
 * Created by Jonathan on 6/29/2014.
 */
public class LowerCaseDecorator extends InputStream {

    private final InputStream stream;

    public LowerCaseDecorator(InputStream  stream){
        String result = "";
        Scanner scanner = new Scanner(stream);
        while(scanner.hasNext()) {
            result += scanner.next().toLowerCase() + " ";
        }
        this.stream = new ByteArrayInputStream( result.getBytes() );
    }

    @Override
    public int read() throws IOException {
        return stream.read();
    }
}
