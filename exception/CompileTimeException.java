package exception;

import java.net.URI;

import javax.xml.crypto.URIReferenceException;

public class CompileTimeException {

	public static void main(String[] args) {

	}  

	public void readFileFromResource() {
		try {

			URI uri =	getClass().getResource( name: "file").toURI();
			Path path = Paths.get(uri);
			Streamkt
		}
		catch (URIReferenceException e) {
			System.out.println("Exception = " +e.getMessage());
		}

	}
}




}
