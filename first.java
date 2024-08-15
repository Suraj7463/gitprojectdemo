System.out.println("enter employee id:");
				 id=sc.nextInt();
				 int ind=0;
				 
				 flag=false;
				
				for(EmployeeInfo info:al)
				{
					 ind=ind+1;
					if(id==info.getId())
					{
						flag=true;
						ind=ind-1;
						
						al.remove(ind);
				}
				}
				if(flag)
				{
					System.out.println("id number "+id+" Employee information deleted successfully");
				}
				else
				{
					System.out.println("id number "+id+" Employee not present in database please enter currect id of employee");
				}
				break;