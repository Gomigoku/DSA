// Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

Solution:
 Class Solution{
    public static int stringToNumber(String columnTitle){
          int result =0;

          for(int i=0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            result = result * 26 + (ch - 'A' +1);
          }
          return result;
    }

    public static void main(String args[]){
      String str = 'A';
      int columnNumber = stringToNumber(str);
      System.out.println("The corresponding column number of the given string is:", columnNumber);
    }
 }
