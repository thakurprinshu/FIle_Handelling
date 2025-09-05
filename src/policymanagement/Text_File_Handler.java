package policymanagement;

import java.io.*;
import java.util.*;

class Text_File_Handler implements File_Handler {

    @Override
    public List<Policy> readPolicies(String fileName) throws IOException {
        List<Policy> policies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double amount = Double.parseDouble(parts[2].trim());
                policies.add(new Policy(id, name, amount));
            }
        }
        return policies;
    }

    @Override
    public void writeSummary(String fileName, String summary) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(summary);
        }
    }
}

