/**
 * generated by Xtext 2.27.0.M2
 */
package br.ufscar.dc.compiladores.alguma.alguma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comando Condicao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.ComandoCondicao#getExp <em>Exp</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.ComandoCondicao#getCmd1 <em>Cmd1</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.ComandoCondicao#getCmd2 <em>Cmd2</em>}</li>
 * </ul>
 *
 * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getComandoCondicao()
 * @model
 * @generated
 */
public interface ComandoCondicao extends Comando
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(ExpressaoRelacional)
   * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getComandoCondicao_Exp()
   * @model containment="true"
   * @generated
   */
  ExpressaoRelacional getExp();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.alguma.alguma.ComandoCondicao#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(ExpressaoRelacional value);

  /**
   * Returns the value of the '<em><b>Cmd1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd1</em>' containment reference.
   * @see #setCmd1(Comando)
   * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getComandoCondicao_Cmd1()
   * @model containment="true"
   * @generated
   */
  Comando getCmd1();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.alguma.alguma.ComandoCondicao#getCmd1 <em>Cmd1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd1</em>' containment reference.
   * @see #getCmd1()
   * @generated
   */
  void setCmd1(Comando value);

  /**
   * Returns the value of the '<em><b>Cmd2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd2</em>' containment reference.
   * @see #setCmd2(Comando)
   * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getComandoCondicao_Cmd2()
   * @model containment="true"
   * @generated
   */
  Comando getCmd2();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.alguma.alguma.ComandoCondicao#getCmd2 <em>Cmd2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd2</em>' containment reference.
   * @see #getCmd2()
   * @generated
   */
  void setCmd2(Comando value);

} // ComandoCondicao