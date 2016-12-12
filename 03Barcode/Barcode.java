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
	_checkDigit = checkSum(zip);
    }

// postcondition: computes and returns the check sum for _zip
    private static int checkSum(String zip){
    	int sum = 0;
	for (int pos = 0; pos < zip.length(); pos++){
	    sum += (int)zip.charAt(pos);
	}
	return sum%10;
    }
    
    private static String convert1(String zip){
	String converted = "";	
	for (int pos = 0; pos < zip.length(); pos++){
	    if ((int)zip.charAt(pos) == '0'){
		converted += "||:::";
	    }
	    if ((int)zip.charAt(pos) == '1'){
		converted += ":::||";
	    }
	    if ((int)zip.charAt(pos) == '2'){
		converted += "::|:|";
	    }
	    if ((int)zip.charAt(pos) == '3'){
		converted += "::||:";
	    }
	    if ((int)zip.charAt(pos) == '4'){
		converted += ":|::|";
	    }
	    if ((int)zip.charAt(pos) == '5'){
		converted += ":|:|:";
	    }
	    if ((int)zip.charAt(pos) == '6'){
		converted += ":||::";
	    }
	    if ((int)zip.charAt(pos) == '7'){
		converted += "|:::|";
	    }
	    if ((int)zip.charAt(pos) == '8'){
		converted += "|::|:";
	    }
	    if ((int)zip.charAt(pos) == '9'){
		converted += "|:|::";
	    }
	}
	return converted;
    }

    private static String convert2(String code){
	String value = "";
	for (int pos = 1; pos < 26; pos+=5){
	    if (code.equals("||:::")){
		value += "0";
	    }
	    else if (code.equals(":::||")){
		value += "1";
	    }
      	    else if (code.equals("::|:|")){
		value += "2";
	    }
       	    else if (code.equals("::||:")){
		value += "3";
	    }
	    else if (code.equals(":|::|")){
		value += "4";
	    }
	    else if (code.equals(":|:|:")){
		value += "5";
	    }
	    else if (code.equals(":||::")){
		value += "6";
	    }
       	    else if (code.equals("|:::|")){
		value += "7";
	    }
       	    else if (code.equals("|::|:")){
		value += "8";
	    }
	    else if (code.equals("|:|::")){
		value += "9";
	    }
	    else {
		throw new IllegalArgumentException("encoded ints are invalid");
	    }
	}
	return value;
    }    

    public static String toCode(String zip){
        return "|" + convert1(zip) + convert1(""+checkSum(zip)) + "|";
    }

    public static String toZip(String code){
	String zip = "";
	if (code.length() != 32){
	    throw new IllegalArgumentException("length of the barcode is not 32");
	}
        if (code.charAt(0) != '|' || code.charAt(31) != '|'){
	    throw new IllegalArgumentException("the left and rigthmost charcters are not '|'");
	}
	for (int pos = 0; pos < code.length(); pos++){
	    if (code.charAt(pos) != '|' || code.charAt(pos) != ':'){
		throw new IllegalArgumentException("non-barcode characters are used");
	    }
	}
	if (convert2(code).charAt(5) != checkSum(convert2(code).substring(0, 5))){
	    throw new IllegalArgumentException("invalid checkSum");
	}
	zip= convert2(code);
	return zip;
    }
	    
	     
	
		
  
//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	return toCode(_zip);
    }


// postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
    	return _zip.compareTo(other._zip);
    }
    
}
