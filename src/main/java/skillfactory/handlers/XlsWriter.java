package skillfactory.handlers;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import skillfactory.model.Statistics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XlsWriter {
    public void tableGenerate(List<Statistics> statistics, String filePath) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFillPattern(FillPatternType.DIAMONDS);

        Font font = workbook.createFont();
        font.setBold(true);
        cellStyle.setFont(font);
        String[] head = {"Профиль обучения", "Средний балл", "Количество обучающихся", "Количество университетов", "Название университета"};
        Row headRow = sheet.createRow(0);
        for (int i = 0; i < head.length; i++) {
            Cell cell = headRow.createCell(i);
            cell.setCellValue(head[i]);
            cell.setCellStyle(cellStyle);
            sheet.autoSizeColumn(i);
        }
        int num = 0;
        for (Statistics statistic : statistics) {
            Row dataRow = sheet.createRow(num++);
            Cell profileCell = dataRow.createCell(0);
            profileCell.setCellValue(statistic.getStudyProfile().getProfileName());
            Cell avgScoreCell = dataRow.createCell(1);
            avgScoreCell.setCellValue(statistic.getAverageRating());
            Cell numberOfStudentsCell = dataRow.createCell(2);
            numberOfStudentsCell.setCellValue(statistic.getQuantityOfStudents());
            Cell numberOfUniversitiesCell = dataRow.createCell(3);
            numberOfUniversitiesCell.setCellValue(statistic.getQuantityOfUniversity());
            Cell universitiesCell = dataRow.createCell(4);
            universitiesCell.setCellValue(statistic.getUniversityName());
        }
           FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            workbook.write(fileOutputStream);

    }
}