package cn.rzhd.wuye.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AuthFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthFunctionExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPageIsNull() {
            addCriterion("PAGE is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("PAGE is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(String value) {
            addCriterion("PAGE =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(String value) {
            addCriterion("PAGE <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(String value) {
            addCriterion("PAGE >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(String value) {
            addCriterion("PAGE >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(String value) {
            addCriterion("PAGE <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(String value) {
            addCriterion("PAGE <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLike(String value) {
            addCriterion("PAGE like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotLike(String value) {
            addCriterion("PAGE not like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<String> values) {
            addCriterion("PAGE in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<String> values) {
            addCriterion("PAGE not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(String value1, String value2) {
            addCriterion("PAGE between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(String value1, String value2) {
            addCriterion("PAGE not between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuIsNull() {
            addCriterion("GENERATEMENU is null");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuIsNotNull() {
            addCriterion("GENERATEMENU is not null");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuEqualTo(String value) {
            addCriterion("GENERATEMENU =", value, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuNotEqualTo(String value) {
            addCriterion("GENERATEMENU <>", value, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuGreaterThan(String value) {
            addCriterion("GENERATEMENU >", value, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuGreaterThanOrEqualTo(String value) {
            addCriterion("GENERATEMENU >=", value, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuLessThan(String value) {
            addCriterion("GENERATEMENU <", value, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuLessThanOrEqualTo(String value) {
            addCriterion("GENERATEMENU <=", value, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuLike(String value) {
            addCriterion("GENERATEMENU like", value, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuNotLike(String value) {
            addCriterion("GENERATEMENU not like", value, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuIn(List<String> values) {
            addCriterion("GENERATEMENU in", values, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuNotIn(List<String> values) {
            addCriterion("GENERATEMENU not in", values, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuBetween(String value1, String value2) {
            addCriterion("GENERATEMENU between", value1, value2, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andGeneratemenuNotBetween(String value1, String value2) {
            addCriterion("GENERATEMENU not between", value1, value2, "generatemenu");
            return (Criteria) this;
        }

        public Criteria andZindexIsNull() {
            addCriterion("ZINDEX is null");
            return (Criteria) this;
        }

        public Criteria andZindexIsNotNull() {
            addCriterion("ZINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andZindexEqualTo(String value) {
            addCriterion("ZINDEX =", value, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexNotEqualTo(String value) {
            addCriterion("ZINDEX <>", value, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexGreaterThan(String value) {
            addCriterion("ZINDEX >", value, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexGreaterThanOrEqualTo(String value) {
            addCriterion("ZINDEX >=", value, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexLessThan(String value) {
            addCriterion("ZINDEX <", value, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexLessThanOrEqualTo(String value) {
            addCriterion("ZINDEX <=", value, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexLike(String value) {
            addCriterion("ZINDEX like", value, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexNotLike(String value) {
            addCriterion("ZINDEX not like", value, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexIn(List<String> values) {
            addCriterion("ZINDEX in", values, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexNotIn(List<String> values) {
            addCriterion("ZINDEX not in", values, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexBetween(String value1, String value2) {
            addCriterion("ZINDEX between", value1, value2, "zindex");
            return (Criteria) this;
        }

        public Criteria andZindexNotBetween(String value1, String value2) {
            addCriterion("ZINDEX not between", value1, value2, "zindex");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("P_ID is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("P_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("P_ID =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("P_ID <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("P_ID >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("P_ID >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("P_ID <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("P_ID <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("P_ID like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("P_ID not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("P_ID in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("P_ID not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("P_ID between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("P_ID not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
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