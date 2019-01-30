class relatlogical {
    public static void main(String[] args) {
    	
    	int number1 = 3, number2 = 4;

    	if (number1 > number2)
    	{
    		System.out.println("number1 is greater than number2.");
    	}
    	else
    	{
    		System.out.println("number2 is greater than number1.");
    	}
     int number3 = 9;
        boolean result;
        result = (number1 > number2) || (number3 > number1);
        System.out.println(result);   
        result = (number1 > number2) && (number3 > number1);
        System.out.println(result);
    }
}
