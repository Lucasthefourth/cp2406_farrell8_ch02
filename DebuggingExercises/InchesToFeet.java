public class InchesToFeet

{
    public static void main(String args[])
    {
        int inches = 30;
        int feetValue, feetRemainder;
        feetValue = inches / 12;
        feetRemainder = inches - (feetValue * 12);
        System.out.println("Divide " + inches + " by 12");
        System.out.println(feetValue + " feet and " + feetRemainder + " inches.");
    }
}