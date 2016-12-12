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

// postcondition: computes and returns the check sum for _zip
    private static int checkSum(String zip){
    	int sum = 0;
	for (int pos = 0; pos < zip.length(); pos++){
	    sum += (int)zip.charAt(pos);
	}
	return sum%10;
    }
    
    private String convert1(String zip){
	String converted = "";	
	for (int pos = 0; pos < zip.length(); pos++){
	    if ((int)zip.length(pos) == 0){
		converted += "||:::";
	    }
	    if ((int)zip.length(pos) == 1){
		converted += ":::||";
	    }
	    if ((int)zip.length(pos) == 2){
		converted += "::|:|";
	    }
	    if ((int)zip.length(pos) == 3){
		converted += "::||:";
	    }
	    if ((int)zip.length(pos) == 4){
		converted += ":|::|";
	    }
	    if ((int)zip.length(pos) == 5){
		converted += ":|:|:";
	    }
	    if ((int)zip.length(pos) == 6){
		converted += ":||::";
	    }
	    if ((int)zip.length(pos) == 7){
		converted += "|:::|";
	    }
	    if ((int)zip.length(pos) == 8){
		converted += "|::|:";
	    }
	    if ((int)zip.length(pos) == 9){
		converted += "|:|::";
	    }
	}
	return converted;
    }

    private String convert2(String code){
	String value = ""
	for (int pos = 0; pos < zip.length(); pos++){
	    if (code.equals("||:::")){
		value += "0";
	    }
	    if (code.equals(":::||")){
		value += "1";
	    }
      	    if (code.equals("::|:|")){
		value += "2";
	    }
       	    if (code.equals("::||:")){
		value += "3";
	    }
	    if (code.equals(":|::|")){
		value += "4";
	    }
	    if (code.equals(":|:|:")){
		value += "5";
	    }
	    if (code.equals(":||::")){
		value += "6";
	    }
       	    if (code.equals("|:::|")){
		value += "7";
	    }
       	    if (code.equals("|::|:")){
		value += "8";
	    }
	    if (code.equals("|:|::")){
		value += "9";
	    }
	}
	return converted;
    }    

    public static String toCode(String zip){
        return "|" + convert1(zip) + checkSum(zip) + "|";
    }

    public static String toZip(String code){
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
