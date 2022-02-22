package ua.lviv.iot;

public record Bank (String bankName, String clients, String credits, int numberOfClients, int numberOfCredits){

    private static String resource = "Google";

    public static void setResource(String _resource) {
        resource = _resource;
    }
    public static String getResource(){
        return resource;
    }

    public Bank() {
        this("PrivatBank", "548", "454545", 34, 434);
        System.out.print("Constructor of zero parameters was called\n");
    }
    public Bank(String bankName, int numberOfClients, int numberOfCredits) {
        this(bankName,"32", "454", 34, 434);
        System.out.print("Constructor of three parameters was called\n");
    }

    @Override
    public String toString(){
        String returnValue = "'" + bankName + "' of " + clients + " have taken " + numberOfCredits ;
        if (credits.length() > 0) {
            returnValue += credits.charAt(0);
            for (int i=1; i<credits.length(); i++) {
                if (credits.charAt(i) == '#') returnValue += ", ";
                returnValue += credits.charAt(i);
            }
        }
        returnValue += '\n';
        return  returnValue;
    }
