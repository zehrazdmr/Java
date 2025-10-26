package labirent;
import java.util.ArrayList;
import java.util.List;
public class labirentUygulama {
//YığıtlaÇözüm
	private static final String Direction="DLRU";
	private static final int[] dr= {1,0,0,-1};
	private static final int[] dc= {0,-1,1,0};
   private static boolean isValid(int r,int c,int n, int[][] labirent) {
	   return r>=0 && c>=0 && r<n && c<n && labirent [r][c]==1;	
   }
   private static void findPath(int r,int c, int [][] labirent,int n,List<String> ans, StringBuilder currentPath ) {
	   if (r==n-1 && c==n-1) {
		   ans.add(currentPath.toString());
		   return;
	   }
	   labirent[r][c]=0;
	   for (int i=0; i<4; i++) {
		  if ()
		  
	   }
   }
   
	
	
	public static void main(String[] args) {
		
	}

}
