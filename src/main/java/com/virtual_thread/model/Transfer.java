package com.virtual_thread.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TBL_MB_TRANSFER")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "TBL_MB_TRANSFER_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private BigInteger id;

    @Column(name = "MAKER_STAMP")
    private String txnDate;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "CHARGE_COMPONENT")
    private String chargeComp;

    @Column(name = "EXT_REF_NO")
    private String extRefNo;

    @Column(name = "TRN_REF_NO")
    private String trnRefNo;

    @Column(name = "BRN")
    private String brn;

    @Column(name = "SOURCE_BRN")
    private String sbrn;

    @Column(name = "SOURCE_CUST_NO")
    private String sourceCustNo;

    @Column(name = "SOURCE_ACC")
    private String sourceAccountNo;

    @Column(name = "SOURCE_CCY")
    private String sourceCcy;

    @Column(name = "DEST_CUST_NO")
    private String destCustNo;

    @Column(name = "DEST_ACC")
    private String destAccountNo;

    @Column(name = "DEST_ACC_NAME")
    private String destAccountName;

    @Column(name = "DEST_CCY")
    private String destCcy;

    @Column(name = "SOURCE_TRN_AMOUNT")
    private BigDecimal sourceTrnAmount;

    @Column(name = "BILL_NO")
    private String billNo;

    @Column(name = "NARRATIVE")
    private String narrative;

    @Column(name = "LCY_AMT")
    private BigDecimal lcyAmount;

    @Column(name = "FEE_AMT")
    private BigDecimal feeAmount;

    @Column(name = "X_RATE")
    private BigDecimal xRate;

    @Column(name = "BILL_NUMBER")
    private String billNumber;

    @Column(name = "COMPANY_ID")
    private String companyId;

    @Column(name = "BILL_CODE")
    private String billCode;

    @Column(name = "FUNCTION_CODE")
    private String functionCode;

    @Column(name = "FEE_LCY_AMT")
    private BigDecimal feeLcyAmt;

    @Column(name = "LCY_RATE")
    private BigDecimal lcyRate;

    @Column(name = "REQUESTID")
    private String requestId;
}
