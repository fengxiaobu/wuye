package cn.rzhd.wuye.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TSysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSysExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompHotlIsNull() {
            addCriterion("COMP_HOTL is null");
            return (Criteria) this;
        }

        public Criteria andCompHotlIsNotNull() {
            addCriterion("COMP_HOTL is not null");
            return (Criteria) this;
        }

        public Criteria andCompHotlEqualTo(String value) {
            addCriterion("COMP_HOTL =", value, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlNotEqualTo(String value) {
            addCriterion("COMP_HOTL <>", value, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlGreaterThan(String value) {
            addCriterion("COMP_HOTL >", value, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_HOTL >=", value, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlLessThan(String value) {
            addCriterion("COMP_HOTL <", value, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlLessThanOrEqualTo(String value) {
            addCriterion("COMP_HOTL <=", value, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlLike(String value) {
            addCriterion("COMP_HOTL like", value, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlNotLike(String value) {
            addCriterion("COMP_HOTL not like", value, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlIn(List<String> values) {
            addCriterion("COMP_HOTL in", values, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlNotIn(List<String> values) {
            addCriterion("COMP_HOTL not in", values, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlBetween(String value1, String value2) {
            addCriterion("COMP_HOTL between", value1, value2, "compHotl");
            return (Criteria) this;
        }

        public Criteria andCompHotlNotBetween(String value1, String value2) {
            addCriterion("COMP_HOTL not between", value1, value2, "compHotl");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeIsNull() {
            addCriterion("OCCUP_NOTICE is null");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeIsNotNull() {
            addCriterion("OCCUP_NOTICE is not null");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeEqualTo(String value) {
            addCriterion("OCCUP_NOTICE =", value, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeNotEqualTo(String value) {
            addCriterion("OCCUP_NOTICE <>", value, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeGreaterThan(String value) {
            addCriterion("OCCUP_NOTICE >", value, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("OCCUP_NOTICE >=", value, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeLessThan(String value) {
            addCriterion("OCCUP_NOTICE <", value, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeLessThanOrEqualTo(String value) {
            addCriterion("OCCUP_NOTICE <=", value, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeLike(String value) {
            addCriterion("OCCUP_NOTICE like", value, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeNotLike(String value) {
            addCriterion("OCCUP_NOTICE not like", value, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeIn(List<String> values) {
            addCriterion("OCCUP_NOTICE in", values, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeNotIn(List<String> values) {
            addCriterion("OCCUP_NOTICE not in", values, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeBetween(String value1, String value2) {
            addCriterion("OCCUP_NOTICE between", value1, value2, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andOccupNoticeNotBetween(String value1, String value2) {
            addCriterion("OCCUP_NOTICE not between", value1, value2, "occupNotice");
            return (Criteria) this;
        }

        public Criteria andCheckInIsNull() {
            addCriterion("CHECK_IN is null");
            return (Criteria) this;
        }

        public Criteria andCheckInIsNotNull() {
            addCriterion("CHECK_IN is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInEqualTo(String value) {
            addCriterion("CHECK_IN =", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotEqualTo(String value) {
            addCriterion("CHECK_IN <>", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInGreaterThan(String value) {
            addCriterion("CHECK_IN >", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_IN >=", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLessThan(String value) {
            addCriterion("CHECK_IN <", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLessThanOrEqualTo(String value) {
            addCriterion("CHECK_IN <=", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLike(String value) {
            addCriterion("CHECK_IN like", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotLike(String value) {
            addCriterion("CHECK_IN not like", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInIn(List<String> values) {
            addCriterion("CHECK_IN in", values, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotIn(List<String> values) {
            addCriterion("CHECK_IN not in", values, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInBetween(String value1, String value2) {
            addCriterion("CHECK_IN between", value1, value2, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotBetween(String value1, String value2) {
            addCriterion("CHECK_IN not between", value1, value2, "checkIn");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptIsNull() {
            addCriterion("PAY_AMOUNT_PROMPT is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptIsNotNull() {
            addCriterion("PAY_AMOUNT_PROMPT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptEqualTo(String value) {
            addCriterion("PAY_AMOUNT_PROMPT =", value, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptNotEqualTo(String value) {
            addCriterion("PAY_AMOUNT_PROMPT <>", value, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptGreaterThan(String value) {
            addCriterion("PAY_AMOUNT_PROMPT >", value, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_AMOUNT_PROMPT >=", value, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptLessThan(String value) {
            addCriterion("PAY_AMOUNT_PROMPT <", value, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptLessThanOrEqualTo(String value) {
            addCriterion("PAY_AMOUNT_PROMPT <=", value, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptLike(String value) {
            addCriterion("PAY_AMOUNT_PROMPT like", value, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptNotLike(String value) {
            addCriterion("PAY_AMOUNT_PROMPT not like", value, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptIn(List<String> values) {
            addCriterion("PAY_AMOUNT_PROMPT in", values, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptNotIn(List<String> values) {
            addCriterion("PAY_AMOUNT_PROMPT not in", values, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptBetween(String value1, String value2) {
            addCriterion("PAY_AMOUNT_PROMPT between", value1, value2, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPayAmountPromptNotBetween(String value1, String value2) {
            addCriterion("PAY_AMOUNT_PROMPT not between", value1, value2, "payAmountPrompt");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsIsNull() {
            addCriterion("PROPERTY_ARREAES_TIPS is null");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsIsNotNull() {
            addCriterion("PROPERTY_ARREAES_TIPS is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsEqualTo(String value) {
            addCriterion("PROPERTY_ARREAES_TIPS =", value, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsNotEqualTo(String value) {
            addCriterion("PROPERTY_ARREAES_TIPS <>", value, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsGreaterThan(String value) {
            addCriterion("PROPERTY_ARREAES_TIPS >", value, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_ARREAES_TIPS >=", value, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsLessThan(String value) {
            addCriterion("PROPERTY_ARREAES_TIPS <", value, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_ARREAES_TIPS <=", value, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsLike(String value) {
            addCriterion("PROPERTY_ARREAES_TIPS like", value, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsNotLike(String value) {
            addCriterion("PROPERTY_ARREAES_TIPS not like", value, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsIn(List<String> values) {
            addCriterion("PROPERTY_ARREAES_TIPS in", values, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsNotIn(List<String> values) {
            addCriterion("PROPERTY_ARREAES_TIPS not in", values, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsBetween(String value1, String value2) {
            addCriterion("PROPERTY_ARREAES_TIPS between", value1, value2, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPropertyArreaesTipsNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_ARREAES_TIPS not between", value1, value2, "propertyArreaesTips");
            return (Criteria) this;
        }

        public Criteria andPayAgreemIsNull() {
            addCriterion("PAY_AGREEM is null");
            return (Criteria) this;
        }

        public Criteria andPayAgreemIsNotNull() {
            addCriterion("PAY_AGREEM is not null");
            return (Criteria) this;
        }

        public Criteria andPayAgreemEqualTo(String value) {
            addCriterion("PAY_AGREEM =", value, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemNotEqualTo(String value) {
            addCriterion("PAY_AGREEM <>", value, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemGreaterThan(String value) {
            addCriterion("PAY_AGREEM >", value, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_AGREEM >=", value, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemLessThan(String value) {
            addCriterion("PAY_AGREEM <", value, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemLessThanOrEqualTo(String value) {
            addCriterion("PAY_AGREEM <=", value, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemLike(String value) {
            addCriterion("PAY_AGREEM like", value, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemNotLike(String value) {
            addCriterion("PAY_AGREEM not like", value, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemIn(List<String> values) {
            addCriterion("PAY_AGREEM in", values, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemNotIn(List<String> values) {
            addCriterion("PAY_AGREEM not in", values, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemBetween(String value1, String value2) {
            addCriterion("PAY_AGREEM between", value1, value2, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andPayAgreemNotBetween(String value1, String value2) {
            addCriterion("PAY_AGREEM not between", value1, value2, "payAgreem");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeIsNull() {
            addCriterion("THREE_PARTY_AGREE is null");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeIsNotNull() {
            addCriterion("THREE_PARTY_AGREE is not null");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeEqualTo(String value) {
            addCriterion("THREE_PARTY_AGREE =", value, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeNotEqualTo(String value) {
            addCriterion("THREE_PARTY_AGREE <>", value, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeGreaterThan(String value) {
            addCriterion("THREE_PARTY_AGREE >", value, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("THREE_PARTY_AGREE >=", value, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeLessThan(String value) {
            addCriterion("THREE_PARTY_AGREE <", value, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeLessThanOrEqualTo(String value) {
            addCriterion("THREE_PARTY_AGREE <=", value, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeLike(String value) {
            addCriterion("THREE_PARTY_AGREE like", value, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeNotLike(String value) {
            addCriterion("THREE_PARTY_AGREE not like", value, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeIn(List<String> values) {
            addCriterion("THREE_PARTY_AGREE in", values, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeNotIn(List<String> values) {
            addCriterion("THREE_PARTY_AGREE not in", values, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeBetween(String value1, String value2) {
            addCriterion("THREE_PARTY_AGREE between", value1, value2, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andThreePartyAgreeNotBetween(String value1, String value2) {
            addCriterion("THREE_PARTY_AGREE not between", value1, value2, "threePartyAgree");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}