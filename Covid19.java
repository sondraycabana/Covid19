//Victor Akwuzie
//Cohort 4
//Java program to detect if you have CORONAL VIRUS symptoms or not.

import java.util.Scanner;
	public class Covid19{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
	System.out.println("INSTRUCTION: Make sure you answer with capital letter ( YES / NO), Goodluck. ");
         int result = 0;
		 String cough; String runningnose;
		//int cough1 = cough;
			
	System.out.print("Do you cough? ( YES / NO) ");
		 cough = input.next();
			if(cough.equals("YES")){ result++;}
			//if(cough==1))
			
			
	System.out.print("Do you have a running nose? ( YES / NO) ");
			runningnose = input.next();
			if(runningnose.equals("YES")){ result++;}


		String diarrhea;
        System.out.print("Are you having diarrhea? ( YES / NO)");
			 diarrhea = input.next();
			if(diarrhea.equals("YES")){result+= 1;}
		String headache;
	System.out.print("Do you have headache? ( YES / NO) ");
			 headache = input.next();
			if(headache.equals("YES")){result+= 1;}
		String MYALGIA;
	System.out.print("Are you experiencing MYALGIA or body ache? ( YES / NO) ");
			MYALGIA = input.next();
			if(MYALGIA.equals("YES")){result+= 1;}
		String sorethroat;
	System.out.print("Are you having sore throat? ( YES / NO)");
		 sorethroat = input.next();
			if(sorethroat.equals("YES")){result+= 1;}
		String fever;
	System.out.print("Are you having having fever? ( YES / NO) ");
			 fever = input.next();
			if(fever.equals("YES")){result+= 1;}
		String breathing;
	System.out.print("Are you having difficulty breathing? ( YES / NO)");
			 breathing = input.next();
			if(breathing.equals("YES")){result+= 2;}
		String fatique;
	System.out.print("Are you experiencing fatique? ( YES / NO)");
			 fatique = input.next();
			if(fatique.equals("YES")){result+= 2;}
		String days14;
	System.out.print("Have you travel recently during the past 14 days? ( YES / NO)");
			 days14 = input.next();
			if( days14.equals("YES")){result+= 3;}
		String INFECTEDAREA;
	System.out.print("Do you have a travel history to COVID-19 INFECTED AREA? ( YES / NO) ");
			 INFECTEDAREA = input.next();
			if(INFECTEDAREA.equals("YES")){result+= 3;}
		String COVID19PATIENCE;
	System.out.print("Do you have direct contact or taking care of a positive COVID-19 PATIENCE? ( YES / NO) ");
			 COVID19PATIENCE  = input.next();
			if(COVID19PATIENCE.equals("YES")){result+= 3;}



	        if(result <= 2){
		System.out.println("Seems you have stress related issue, try to be observant");
		}
		if(result >= 3 && result <= 5){
		System.out.println("Hydrate properly and proper personal hygiene, observe and re-evaluate  after 2 days");
		}
		if(result >= 6 && result <= 12){
		System.out.println("Seek a consultation with Doctor");
		}
		if(result >= 12 && result <= 20){
		System.out.println("CALL THE NCNC HOTLINE 080097000010");
		}
		
}
}
