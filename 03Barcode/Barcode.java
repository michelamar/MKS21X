public class Barcode implements Comparable<Barcode>{
// instance variables
    private String _zip;
    private int _checkDigit;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
    public Barcode(String zip) {
	_zip = zip;
	_checkDigit = checkSum();
    }

// postcondition: Creates a copy of a bar code.//
//    public Barcode clone(){}


// postcondition: computes and returns the check sum for _zip
    private int checkSum(){
    	int sum = 0;
	for (int pos = 0; pos < _zip.length(); pos++){
	    sum += (int)_zip.charAt(pos);
	}
	return sum%10;
    }
    
    private String convert(){
	String converted = "";	
	for (int pos = 0; pos < _zip.length(); pos++){
	    if ((int)_zip.length(pos) == 0){
		converted += "||:::";
	    }
    }
//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
//    public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
    	return 2;
    }
    
}
