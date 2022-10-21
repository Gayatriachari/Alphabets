package practice.problems;

public class Launch4 { 
	public static void main(String[] args) { 
		int n=5;
		for(int i=0;i<n;i++) { 
			// FOR A 
			for(int j=0; j<n; j++)
			{
				if(((j==0||j==(n-1))&&i!=0)||i==(n-1)/2||(j!=0&&j!=(n-1))&&i==0)
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");  
			//FOR B
			for(int j=0; j<n; j++)
			{
				if(j==0||((i==0||i==(n-1)||i==(n-1)/2)&&j!=(n-1))||(j==n-1&&i!=0&&i!=(n-1)&&i!=(n-1)/2))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   "); 
			//FOR C
			for(int j=0;j<n;j++) {
				if((j==0&&i!=0&&i!=(n-1))||(i==0&&j!=0)||(i==(n-1)&&j!=0)) {
					System.out.print("*");
				} 
				else {
					System.out.print(" ");
				}
			} 
			System.out.print("   "); 
			//FOR D
			for(int j=0; j<n; j++)
			{
				if(j==0||(i==0||i==(n-1))&&j!=(n-1)||(j==(n-1)&&i!=0&&i!=(n-1)))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   "); 
			//FOR E
			for(int j=0; j<n; j++)
			{
				if(j==0||i==(n-1)/2||i==0|i==n-1)
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("  "); 
			//FOR F
			for(int j=0; j<n; j++)
			{
				if(j==0||i==(n-1)/2||i==0)
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");
			//FOR G
			for(int j=0; j<n; j++)
			{
				if((j==0&&i!=0)||(i==0&&j!=0)||i==(n-1)||(j==(n-1)&&i>(n-1)/2)||i==(n-1)/2&&j>(n-1)/2)
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");
			// FOR H
		    for(int j=0; j<n; j++)
		    {
		        if(j==0||j==(n-1)||i==(n-1)/2)
			    {
				    System.out.print("*");
			    } 
			    else
			    {
				    System.out.print(" ");
			    }
		    }  
		    System.out.print("  ");
			//FOR I
			for(int j=0; j<n; j++)
			{
				if(i==0||i==n-1||j==(n-1)/2)
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");
			//FOR J
			for(int j=0; j<n; j++)
			{
				if(i==0||j==(n-1)/2||(i==n-1&&j<(n-1)/2))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   "); 
			//FOR K
			for(int j=0; j<n; j++)
			{
				if(j==0||((i==(n-1)/2)&&j<=(n-1)/2)||(i+j==(n-1)&&j>=(n-1)/2)||(i==j&&j>=(n-1)/2))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			} 
			System.out.print("   "); 
			//FOR L
			for(int j=0; j<n; j++)
			{
				if(j==0||i==n-1)
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			} 
			System.out.print("   "); 
			//FOR M
			for(int j=0; j<n; j++)
			{
				if(j==0||j==n-1||((i==j||i+j==n-1)&&i<=(n-1)/2))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");
			//FOR N
			for(int j=0; j<n; j++)
			{
				if(j==0||j==(n-1)||i==j)
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");
			// FOR O
			for(int j=0; j<n; j++)
			{
				if(((i==0||i==n-1)&&j!=0&&j!=n-1)||((j==0||j==n-1)&&i!=0&&i!=n-1))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   "); 
			// FOR P 
			for(int j=0; j<n; j++)
			{
				if((j==0&&i!=0)||(j!=0&&i==0&&j!=n-1)||i==(n-1)/2||(j==n-1&&i<(n-1)/2&&i!=0))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");
			//FOR Q 
			for(int j=0; j<n; j++)
			{
				if(((((j==0&&i!=n-1)||j==(n-1))&&i!=0))||((i==0&&j!=0&&j!=n-1)||(i==n-1&&j!=0))||(i==j&&j>=(n-1)/2))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   "); 
			//FOR R
			for(int j=0; j<n; j++)
			{
				if(j==0||(i==0&&j!=n-1)||((i==(n-1)/2)&&j<=(n-1)/2)||(i+j==(n-1)&&j>=(n-1)/2&&j!=n-1)||(i==j&&j>=(n-1)/2))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   "); 
			// FOR S
			for(int j=0; j<n; j++)
			{
				if(i==0||i==n-1||i==(n-1)/2||(j==0&&i<=(n-1)/2)||(j==n-1&&i>(n-1)/2))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");  
			//FOR T
			for(int j=0; j<n; j++)
			{
				if(i==0||j==(n-1)/2)
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   "); 
			// FOR U
		    for(int j=0; j<n; j++)
		    {
		        if(j==0||j==(n-1)||i==n-1)
			    {
				    System.out.print("*");
			    } 
			    else
			    {
				    System.out.print(" ");
			    }
		    }  
		    System.out.print("  ");
			//FOR W
			for(int j=0; j<n; j++)
			{
				if(j==0||j==(n-1)||(i+j==n-1&&j<=(n-1)/2)||(i==j&&j>=(n-1)/2))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");
		    //for X
			for(int j=0; j<n; j++)
			{
				if(i==j||i+j==n-1)
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");
			//FOR  Y
			for(int j=0; j<n; j++)
			{
				if(j==(n-1)/2&&i>=(n-1)/2||((i==j||i+j==(n-1))&&i<(n-1)/2))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.print("   ");
			//FOR Z
			for(int j=0; j<n; j++)
			{
				if(i==0||i==n-1||i+j==(n-1))
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}  
			System.out.println();
		}
	} 
}
