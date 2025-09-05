package policymanagement;

import java.io.IOException;
import java.util.List;

class Policy_Manager {
    private final File_Handler fileHandler;

    public Policy_Manager(File_Handler fileHandler) {
        this.fileHandler = fileHandler;
    }

    public void processPolicies(String inputFile, String outputFile) {
        try {
            List<Policy> policies = fileHandler.readPolicies(inputFile);

            int totalPolicies = policies.size();
            double totalAmount = policies.stream().mapToDouble(Policy::getAmount).sum();

            String summary = "TotalNumberOfPolicies: " + totalPolicies + "\n"
                    + "TotalPolicyAmount: " + totalAmount;

            fileHandler.writeSummary(outputFile, summary);

            System.out.println("✅ Summary written to " + outputFile);

        } catch (IOException e) {
            System.err.println("Error processing policies: " + e.getMessage());
        }
    }
}
