package String_Copy;

public class StrCpy {
	
	void copyStr(String str1, String str2, int index) {
		char [] i=str1.toCharArray();
		char [] bos=new char[str1.length()];
		if (index==str1.length()) 
			return;	
		else {
			bos[index]=i[index];
			index++;
			copyStr(str1,str2,index);
		}
		str2=bos.toString();
	}

	public static void main(String[] args) {
		StrCpy st=new StrCpy();
		st.copyStr("merhaba", "",0);
	    

	}

}
