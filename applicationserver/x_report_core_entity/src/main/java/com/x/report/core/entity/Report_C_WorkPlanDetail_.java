/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.report.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.report.core.entity.Report_C_WorkPlanDetail.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Sep 02 18:44:17 CST 2018")
public class Report_C_WorkPlanDetail_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,Date> createTime;
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,String> id;
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,String> keyWorkId;
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,String> planContent;
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,String> planId;
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,String> reportId;
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,String> sequence;
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,Date> updateTime;
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,String> workContent;
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,String> workInfoId;
    public static volatile SingularAttribute<Report_C_WorkPlanDetail,String> workTitle;
}