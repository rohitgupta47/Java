package com.rohit;
import java.util.*;
public class MenuBasedProg {
	public static Scanner s1=new Scanner(System.in);
	
	public static void main(String[] args) {
		int x=0;
		ArrayList<String> list=new ArrayList<String>();
		Scanner s2=new Scanner(System.in);
		
		while(x!=6) {
			System.out.println("enter your choice");
			System.out.println("option1: add friends to list");
			System.out.println("option2: list the friends");
			System.out.println("opiton3: remove the friend's name");
			System.out.println("option4: search the friend's name");
			System.out.println("option5: sort the friends list based on alphabets and lengthwise");
			System.out.println("option6: Exit");
			x=s1.nextInt();
			switch(x) {
			case 1:
				System.out.println("you pressed your choice 1");
				System.out.println("enter your friend's name");
				list.add(s2.next());
				break;
			case 2:
				System.out.println("you pressed choice 2 to list names");
				System.out.println(list);
				break;
			case 3:
				System.out.println("you pressed choice 3 to remove a friend name");
				String s3=s2.next();
				if(list.contains(s3)) {
				list.remove(s3);
				System.out.println("see I've removed your friend's name "+list);
				}
				else System.out.println("name not fount to be removed "); 
					break;
			case 4:
				System.out.println("you pressed choice 4 to search name in list whether it is prsent or not");
				System.out.println("Enter that name to search in the list");
				String s4=s2.next();
				if(list.contains(s4))
					System.out.println("yes "+s4+" is there in list");
				else System.out.println(" no "+s4+" not there");
				break;
			case 5:
				System.out.println("you pressed choice 5 so enter your choice for what order you want ");
				System.out.println("enter 1 for sorting alphabetical increasing");
				System.out.println("enter 2 for sorting alphabetical decreasing");
				System.out.println("enter 3 for sorting lengthwise increasing");
				int y=s2.nextInt();
				switch(y) {
				case 1:
				Collections.sort(list);
				System.out.println("sorting list alphabetically increasing "+list);
				break;
				case 2:
				Collections.sort(list, new MenuComparator());
				System.out.println("sorting list alphabetically decreasing "+list);
				break;
				case 3:
				Collections.sort(list, new MenuComparator1());
				System.out.println("sorting based on length()"+list);
				break;
				default: System.out.println("wrong no. entered for sorting .enter no. from 1-3 only ");
				}
			case 6 : System.out.println("Exiting the menu.....");
			break;
			default:System.out.println("wrong choice");
			break;
			}
			
		}
	}

}
