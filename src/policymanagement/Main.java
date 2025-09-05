package policymanagement;

public class Main {
    public static void main(String[] args) {
        File_Handler handler = new Text_File_Handler();
        Policy_Manager manager = new Policy_Manager(handler);

        manager.processPolicies("policies.txt", "summary.txt");
    }
}
