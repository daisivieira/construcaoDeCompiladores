/**
 * generated by Xtext 2.27.0.M2
 */
package br.ufscar.dc.compiladores.alguma.alguma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fator Numero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.alguma.alguma.FatorNumero#getNumero <em>Numero</em>}</li>
 * </ul>
 *
 * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getFatorNumero()
 * @model
 * @generated
 */
public interface FatorNumero extends FatorAritmetico
{
  /**
   * Returns the value of the '<em><b>Numero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numero</em>' attribute.
   * @see #setNumero(int)
   * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#getFatorNumero_Numero()
   * @model
   * @generated
   */
  int getNumero();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.alguma.alguma.FatorNumero#getNumero <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numero</em>' attribute.
   * @see #getNumero()
   * @generated
   */
  void setNumero(int value);

} // FatorNumero