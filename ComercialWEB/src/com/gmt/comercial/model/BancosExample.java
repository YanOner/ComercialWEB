package com.gmt.comercial.model;

import java.util.ArrayList;
import java.util.List;

public class BancosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BancosExample() {
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

        public Criteria andIdBancosIsNull() {
            addCriterion("IdBancos is null");
            return (Criteria) this;
        }

        public Criteria andIdBancosIsNotNull() {
            addCriterion("IdBancos is not null");
            return (Criteria) this;
        }

        public Criteria andIdBancosEqualTo(Integer value) {
            addCriterion("IdBancos =", value, "idBancos");
            return (Criteria) this;
        }

        public Criteria andIdBancosNotEqualTo(Integer value) {
            addCriterion("IdBancos <>", value, "idBancos");
            return (Criteria) this;
        }

        public Criteria andIdBancosGreaterThan(Integer value) {
            addCriterion("IdBancos >", value, "idBancos");
            return (Criteria) this;
        }

        public Criteria andIdBancosGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdBancos >=", value, "idBancos");
            return (Criteria) this;
        }

        public Criteria andIdBancosLessThan(Integer value) {
            addCriterion("IdBancos <", value, "idBancos");
            return (Criteria) this;
        }

        public Criteria andIdBancosLessThanOrEqualTo(Integer value) {
            addCriterion("IdBancos <=", value, "idBancos");
            return (Criteria) this;
        }

        public Criteria andIdBancosIn(List<Integer> values) {
            addCriterion("IdBancos in", values, "idBancos");
            return (Criteria) this;
        }

        public Criteria andIdBancosNotIn(List<Integer> values) {
            addCriterion("IdBancos not in", values, "idBancos");
            return (Criteria) this;
        }

        public Criteria andIdBancosBetween(Integer value1, Integer value2) {
            addCriterion("IdBancos between", value1, value2, "idBancos");
            return (Criteria) this;
        }

        public Criteria andIdBancosNotBetween(Integer value1, Integer value2) {
            addCriterion("IdBancos not between", value1, value2, "idBancos");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("Descripcion is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("Descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("Descripcion =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("Descripcion <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("Descripcion >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("Descripcion >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("Descripcion <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("Descripcion <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("Descripcion like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("Descripcion not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("Descripcion in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("Descripcion not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("Descripcion between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("Descripcion not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andNroCuentaIsNull() {
            addCriterion("NroCuenta is null");
            return (Criteria) this;
        }

        public Criteria andNroCuentaIsNotNull() {
            addCriterion("NroCuenta is not null");
            return (Criteria) this;
        }

        public Criteria andNroCuentaEqualTo(String value) {
            addCriterion("NroCuenta =", value, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaNotEqualTo(String value) {
            addCriterion("NroCuenta <>", value, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaGreaterThan(String value) {
            addCriterion("NroCuenta >", value, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaGreaterThanOrEqualTo(String value) {
            addCriterion("NroCuenta >=", value, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaLessThan(String value) {
            addCriterion("NroCuenta <", value, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaLessThanOrEqualTo(String value) {
            addCriterion("NroCuenta <=", value, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaLike(String value) {
            addCriterion("NroCuenta like", value, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaNotLike(String value) {
            addCriterion("NroCuenta not like", value, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaIn(List<String> values) {
            addCriterion("NroCuenta in", values, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaNotIn(List<String> values) {
            addCriterion("NroCuenta not in", values, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaBetween(String value1, String value2) {
            addCriterion("NroCuenta between", value1, value2, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andNroCuentaNotBetween(String value1, String value2) {
            addCriterion("NroCuenta not between", value1, value2, "nroCuenta");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNull() {
            addCriterion("Estado is null");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNotNull() {
            addCriterion("Estado is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoEqualTo(String value) {
            addCriterion("Estado =", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotEqualTo(String value) {
            addCriterion("Estado <>", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThan(String value) {
            addCriterion("Estado >", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThanOrEqualTo(String value) {
            addCriterion("Estado >=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThan(String value) {
            addCriterion("Estado <", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThanOrEqualTo(String value) {
            addCriterion("Estado <=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLike(String value) {
            addCriterion("Estado like", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotLike(String value) {
            addCriterion("Estado not like", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoIn(List<String> values) {
            addCriterion("Estado in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotIn(List<String> values) {
            addCriterion("Estado not in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoBetween(String value1, String value2) {
            addCriterion("Estado between", value1, value2, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotBetween(String value1, String value2) {
            addCriterion("Estado not between", value1, value2, "estado");
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