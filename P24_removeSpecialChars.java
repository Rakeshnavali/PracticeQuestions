class P24_removeSpecialChars{
    public static void main(String[] args) {
        String str = "#$%& String hi@i this i rak==esh from reva &%&%university";
        System.out.println(" Before removing space: "+str);
        str = str.replaceAll("[^a-zA-z0-9]", "");
        System.out.println("String after removing space: "+ str);
    }
}