class Solution {
    public int compareVersion(String version1, String version2) {
        
        int v1=version1.length();
        int v2=version2.length();
        
        // initialize the two variable to traverse
        int i=0;
        int j=0;
        
        //traverse through the two strings
        while(i<v1 || j<v2){
            
            // initialize the value upto a dot
            int n1=0;
            int n2=0;
            
            //traverse through the first string to dot
            while(i<v1 && version1.charAt(i) != '.'){
                n1=n1*10+Character.getNumericValue(version1.charAt(i));
                i++;
            }
            //traverse through the second string to dot
            while(j<v2 && version2.charAt(j) !='.'){
                n2=n2*10+Character.getNumericValue(version2.charAt(j));
                j++;
            }
            
            //checking for comparison
            if(n1>n2) return 1;
            if(n2>n1) return -1;
            i++;
            j++;
        }
        //if every comparison matches then they are equal
        return 0;
    }
}