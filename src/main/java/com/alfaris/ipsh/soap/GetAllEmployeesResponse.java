//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.23 at 03:25:18 PM IST 
//


package com.alfaris.ipsh.soap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="employeeList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="empId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="doj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employeeList"
})
@XmlRootElement(name = "getAllEmployeesResponse")
public class GetAllEmployeesResponse {

    protected List<GetAllEmployeesResponse.EmployeeList> employeeList;

    /**
     * Gets the value of the employeeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the employeeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetAllEmployeesResponse.EmployeeList }
     * 
     * 
     */
    public List<GetAllEmployeesResponse.EmployeeList> getEmployeeList() {
        if (employeeList == null) {
            employeeList = new ArrayList<GetAllEmployeesResponse.EmployeeList>();
        }
        return this.employeeList;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="empId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="doj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "empId",
        "department",
        "name",
        "age",
        "gender",
        "email",
        "doj",
        "salary",
        "status"
    })
    public static class EmployeeList {

        @XmlElement(required = true)
        protected String empId;
        @XmlElement(required = true)
        protected String department;
        @XmlElement(required = true)
        protected String name;
        protected int age;
        @XmlElement(required = true)
        protected String gender;
        @XmlElement(required = true)
        protected String email;
        @XmlElement(required = true)
        protected String doj;
        @XmlElement(required = true)
        protected BigDecimal salary;
        @XmlElement(required = true)
        protected String status;

        /**
         * Gets the value of the empId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmpId() {
            return empId;
        }

        /**
         * Sets the value of the empId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmpId(String value) {
            this.empId = value;
        }

        /**
         * Gets the value of the department property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartment() {
            return department;
        }

        /**
         * Sets the value of the department property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartment(String value) {
            this.department = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the age property.
         * 
         */
        public int getAge() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         */
        public void setAge(int value) {
            this.age = value;
        }

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGender(String value) {
            this.gender = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the doj property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDoj() {
            return doj;
        }

        /**
         * Sets the value of the doj property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDoj(String value) {
            this.doj = value;
        }

        /**
         * Gets the value of the salary property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSalary() {
            return salary;
        }

        /**
         * Sets the value of the salary property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSalary(BigDecimal value) {
            this.salary = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

    }

}
