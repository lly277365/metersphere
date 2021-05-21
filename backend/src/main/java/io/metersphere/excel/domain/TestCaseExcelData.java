package io.metersphere.excel.domain;

import com.alibaba.excel.annotation.ExcelIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestCaseExcelData {

    @ExcelIgnore
    private Integer num;
    @ExcelIgnore
    private String customNum;
    @ExcelIgnore
    private String name;
    @ExcelIgnore
    private String nodePath;
    @ExcelIgnore
    private String maintainer;
    @ExcelIgnore
    private String priority;
    @ExcelIgnore
    private String tags;
    @ExcelIgnore
    private String prerequisite;
    @ExcelIgnore
    private String remark;
    @ExcelIgnore
    private String stepDesc;
    @ExcelIgnore
    private String stepResult;
    @ExcelIgnore
    private String stepModel;
}
