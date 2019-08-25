//package com.lanswon.util;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.springframework.web.multipart.MultipartFile;
//import sun.text.normalizer.UCharacter;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//public class ExcelUtil {
//
//    /**
//     * 获取Cell 格子中的值判断格子中的值
//     * @param cell
//     * @return
//     */
//    public  String getCellValue(Cell cell){
//        String cellValue = "";
//        if(cell == null){
//            return cellValue;
//        }
//        //把数字当成String来读，避免出现1读成1.0的情况
////        if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){
////            cell.setCellType(Cell.CELL_TYPE_STRING);
////        }
//        if(cell.getCellTypeEnum()== CellType.NUMERIC){
//            cell.setCellType(CellType.STRING);
//        }
//        //判断数据的类型
//        switch (cell.getCellTypeEnum()){
//            case NUMERIC:
//                cellValue = String.valueOf(cell.getNumericCellValue());
//                break;
//            case STRING:
//                cellValue = String.valueOf(cell.getStringCellValue());
//                break;
//            case BOOLEAN:
//                cellValue = String.valueOf(cell.getBooleanCellValue());
//                break;
//            case FORMULA:
//                cellValue = String.valueOf(cell.getCellFormula());
//                break;
//            case BLANK:
//                cellValue = "";
//                break;
//            case ERROR:
//                cellValue = "非法字符";
//                break;
//            default:
//                cellValue = "未知类型";
//                break;
//        }
//        return cellValue;
//    }
//
//
//   public Workbook initWorkBook(MultipartFile file) throws IOException {
//        String postfix = getPostfix(file.getOriginalFilename());
//        if (!"".equals(postfix)) {
//            InputStream input = file.getInputStream();
//            Workbook workbook = null;
//            if ("xls".equals(postfix)) {
//                workbook = new HSSFWorkbook(input);
//            } else if ("xlsx".equals(postfix)) {
//                workbook = new XSSFWorkbook(input);
//            }
//            return workbook;
//        }else {
//            return null;
//        }
//    }
//
//    /**
//     * 获得path的后缀名
//     * @param path
//     * @return
//     */
//    private String getPostfix(String path){
//        if(path==null){
//            return "";
//        }
//        if(path.contains(".")){
//            return path.substring(path.lastIndexOf(".") + 1, path.length());
//        }
//        return "";
//    }
//
//}
