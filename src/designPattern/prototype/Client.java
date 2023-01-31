package designPattern.prototype;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        Student aprBatch = new Student();
        aprBatch.setAvgBatchPsp(80);
        aprBatch.setBatchName("Apr-LLD-Batch");
        aprBatch.setYearOfEnrollment(2022);
        studentRegistry.save(aprBatch);

        Student mayBatch = new Student();
        mayBatch.setAvgBatchPsp(75);
        mayBatch.setBatchName("May-LLD-Batch");
        mayBatch.setYearOfEnrollment(2022);
        studentRegistry.save(mayBatch);

        Student janBatch = new Student();
        janBatch.setAvgBatchPsp(85);
        janBatch.setBatchName("Jan-LLD-Batch");
        janBatch.setYearOfEnrollment(2023);
        studentRegistry.save(janBatch);

        Student aprStudent = studentRegistry.get("Apr-LLD-Batch").clone();
        Student mayStudent = studentRegistry.get("May-LLD-Batch").clone();
        Student janStudent = studentRegistry.get("Jan-LLD-Batch").clone();

    }
}
