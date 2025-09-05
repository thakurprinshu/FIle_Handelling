package policymanagement;

import java.io.IOException;
import java.util.List;

public interface File_Handler {
    List<Policy> readPolicies(String fileName) throws IOException;
    void writeSummary(String fileName, String summary) throws IOException;
}
