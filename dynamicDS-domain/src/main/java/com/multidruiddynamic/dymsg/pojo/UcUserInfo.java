package com.multidruiddynamic.dymsg.pojo;

import java.io.Serializable;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author shenym@belink.com
 * @since 2020-11-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UcUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("UUI_USERID")
    private String userId;
    @TableField("UUI_MOBILENO")
    private String mobileNo;
    @TableField("BANK_CUSTNO")
    private String ecifCustNo;
    @TableField("UUI_NICKNAME")
    private String nickName;
    @TableField("UUI_USER_LEVEL")
    private String userLevel;
    @TableField("UUI_RGST_TM")
    private String registDate;
    @TableField("UUI_RGST_BRANCHNO")
    private String userRegistCom;
    @TableField("UUI_TELLERNO")
    private String tellerNo;
    @TableField("UUI_STATUS")
    private String userStt;
    @TableField("UUI_USER_TYPE")
    private String userType;
    @TableField("UUI_CERTIFIC_FLAG")
    private String certificFlag;
    @TableField("UUI_CERTIFIC_TM")
    private String certificTM;
    @TableField("UUI_H5_REG")
    private String reg_h5_channel;
    @TableField("UUI_H5_SRC")
    private String reg_h5_source;


}
