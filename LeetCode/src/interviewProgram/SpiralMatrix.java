package interviewProgram;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] a = {
	            {1,  2,  3,  4},
	            {14, 15, 16, 5},
	            {13, 20, 17, 6},
	            {12, 19, 18, 7},
	            {11, 10, 9,  8}
	        };

	        int rowStart = 0;
	        int rowEnd = a.length - 1;
	        int colStart = 0;
	        int colEnd = a[0].length - 1;

	        while (rowStart <= rowEnd && colStart <= colEnd) {
	            // Top row
	           for(int i=colStart;i<=colEnd;i++)
	           {
	        	   System.out.print(a[rowStart][i]+" ");
	           }
	           rowStart++;
	           for(int i=rowStart;i<=rowEnd;i++)
	           {
	        	   System.out.print(a[i][colEnd]+" ");
	           }
	           colEnd--;
	           
	                for (int i = colEnd; i >= colStart; i--) {
	                    System.out.print(a[rowEnd][i] +" ");
	                }
	                rowEnd--;
	            

	            // Left column
	          
	                for (int i = rowEnd; i >= rowStart; i--) {
	                    System.out.print(a[i][colStart]+" "
	                    		
	                    		
	                    		);
	                }
	                colStart++;
	            
	}
}}