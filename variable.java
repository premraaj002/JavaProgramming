public class variable {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a = 10;
        System.out.println("hello"+a);
        float b = 10.5f;
        char myChar = 'A';
        boolean myBool = true;
        String myString = "Hello";
        System.out.println(a + ", " + b + ", " + myChar + ", " + myBool + ", " + myString);

        //user score calculator
        int maxScore = 500;
        int userScore = 423;
        float percentage = (float)userScore/maxScore*100.0f;
        System.out.println("The percentage is: " + percentage);
    }
}



/*Data Type	Description
byte	Stores whole numbers from -128 to 127
short	Stores whole numbers from -32,768 to 32,767
int	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
boolean	Stores true or false values
char	Stores a single character/letter or ASCII values */