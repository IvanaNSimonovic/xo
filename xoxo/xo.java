package xoxo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class xo {
		
			public static void print(char[][] matrix) {
				for(int i = 0; i < matrix.length; i++) {
					for(int j = 0; j < matrix[i].length; j++) {
						System.out.print(matrix[i][j]);
					}
					System.out.println();				
				}		
			}
			
			public static void main(String[] args) {
				try(BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\Teona\\Downloads\\iksoks.txt"))){
					String[] nums = r.readLine().split(" ");
					int N = Integer.parseInt(nums[0]);
					int M = Integer.parseInt(nums[1]);
					
					char matrix[][] = new char[N][N];
					
					for(int i = 0; i < matrix.length; i++) {
						String line = r.readLine();
						for(int j = 0; j < matrix[i].length; j++) {
							matrix[i][j] = line.charAt(j);
						}
					}
						
					print(matrix);
					
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		

	}


