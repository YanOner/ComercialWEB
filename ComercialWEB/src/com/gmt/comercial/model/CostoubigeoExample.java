package com.gmt.comercial.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CostoubigeoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostoubigeoExample() {
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

        public Criteria andCodUbigeoCostoIsNull() {
            addCriterion("CodUbigeoCosto is null");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoIsNotNull() {
            addCriterion("CodUbigeoCosto is not null");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoEqualTo(String value) {
            addCriterion("CodUbigeoCosto =", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoNotEqualTo(String value) {
            addCriterion("CodUbigeoCosto <>", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoGreaterThan(String value) {
            addCriterion("CodUbigeoCosto >", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoGreaterThanOrEqualTo(String value) {
            addCriterion("CodUbigeoCosto >=", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoLessThan(String value) {
            addCriterion("CodUbigeoCosto <", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoLessThanOrEqualTo(String value) {
            addCriterion("CodUbigeoCosto <=", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoLike(String value) {
            addCriterion("CodUbigeoCosto like", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoNotLike(String value) {
            addCriterion("CodUbigeoCosto not like", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoIn(List<String> values) {
            addCriterion("CodUbigeoCosto in", values, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoNotIn(List<String> values) {
            addCriterion("CodUbigeoCosto not in", values, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoBetween(String value1, String value2) {
            addCriterion("CodUbigeoCosto between", value1, value2, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoNotBetween(String value1, String value2) {
            addCriterion("CodUbigeoCosto not between", value1, value2, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andDistritoIsNull() {
            addCriterion("Distrito is null");
            return (Criteria) this;
        }

        public Criteria andDistritoIsNotNull() {
            addCriterion("Distrito is not null");
            return (Criteria) this;
        }

        public Criteria andDistritoEqualTo(String value) {
            addCriterion("Distrito =", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotEqualTo(String value) {
            addCriterion("Distrito <>", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoGreaterThan(String value) {
            addCriterion("Distrito >", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("Distrito >=", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoLessThan(String value) {
            addCriterion("Distrito <", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoLessThanOrEqualTo(String value) {
            addCriterion("Distrito <=", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoLike(String value) {
            addCriterion("Distrito like", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotLike(String value) {
            addCriterion("Distrito not like", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoIn(List<String> values) {
            addCriterion("Distrito in", values, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotIn(List<String> values) {
            addCriterion("Distrito not in", values, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoBetween(String value1, String value2) {
            addCriterion("Distrito between", value1, value2, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotBetween(String value1, String value2) {
            addCriterion("Distrito not between", value1, value2, "distrito");
            return (Criteria) this;
        }

        public Criteria andProvinciaIsNull() {
            addCriterion("Provincia is null");
            return (Criteria) this;
        }

        public Criteria andProvinciaIsNotNull() {
            addCriterion("Provincia is not null");
            return (Criteria) this;
        }

        public Criteria andProvinciaEqualTo(String value) {
            addCriterion("Provincia =", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotEqualTo(String value) {
            addCriterion("Provincia <>", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaGreaterThan(String value) {
            addCriterion("Provincia >", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("Provincia >=", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLessThan(String value) {
            addCriterion("Provincia <", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLessThanOrEqualTo(String value) {
            addCriterion("Provincia <=", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLike(String value) {
            addCriterion("Provincia like", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotLike(String value) {
            addCriterion("Provincia not like", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaIn(List<String> values) {
            addCriterion("Provincia in", values, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotIn(List<String> values) {
            addCriterion("Provincia not in", values, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaBetween(String value1, String value2) {
            addCriterion("Provincia between", value1, value2, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotBetween(String value1, String value2) {
            addCriterion("Provincia not between", value1, value2, "provincia");
            return (Criteria) this;
        }

        public Criteria andDepartamentoIsNull() {
            addCriterion("Departamento is null");
            return (Criteria) this;
        }

        public Criteria andDepartamentoIsNotNull() {
            addCriterion("Departamento is not null");
            return (Criteria) this;
        }

        public Criteria andDepartamentoEqualTo(String value) {
            addCriterion("Departamento =", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotEqualTo(String value) {
            addCriterion("Departamento <>", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoGreaterThan(String value) {
            addCriterion("Departamento >", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("Departamento >=", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoLessThan(String value) {
            addCriterion("Departamento <", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("Departamento <=", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoLike(String value) {
            addCriterion("Departamento like", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotLike(String value) {
            addCriterion("Departamento not like", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoIn(List<String> values) {
            addCriterion("Departamento in", values, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotIn(List<String> values) {
            addCriterion("Departamento not in", values, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoBetween(String value1, String value2) {
            addCriterion("Departamento between", value1, value2, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotBetween(String value1, String value2) {
            addCriterion("Departamento not between", value1, value2, "departamento");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioIsNull() {
            addCriterion("CostoEnvio is null");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioIsNotNull() {
            addCriterion("CostoEnvio is not null");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioEqualTo(BigDecimal value) {
            addCriterion("CostoEnvio =", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioNotEqualTo(BigDecimal value) {
            addCriterion("CostoEnvio <>", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioGreaterThan(BigDecimal value) {
            addCriterion("CostoEnvio >", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CostoEnvio >=", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioLessThan(BigDecimal value) {
            addCriterion("CostoEnvio <", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CostoEnvio <=", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioIn(List<BigDecimal> values) {
            addCriterion("CostoEnvio in", values, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioNotIn(List<BigDecimal> values) {
            addCriterion("CostoEnvio not in", values, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostoEnvio between", value1, value2, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostoEnvio not between", value1, value2, "costoEnvio");
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