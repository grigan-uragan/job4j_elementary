package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report name", "Report body");
        System.out.println(text);
        HtmlReport htmlReport = new HtmlReport();
        text = htmlReport.generate("name", "body");
        System.out.println(text);
        JSONReport jsonReport = new JSONReport();
        text = jsonReport.generate("name", "body");
        System.out.println(text);
    }
}
