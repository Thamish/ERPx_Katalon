import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://indmodsan.unit4.com/SDX_PSO/Login/Login.aspx?ReturnUrl=%2fSDX_PSO%2f')

WebUI.setText(findTestObject('Page_Login - Unit4 ERP/input_User name_ctl10name'), 'Unit4')

WebUI.setText(findTestObject('Page_Login - Unit4 ERP/input_Client_ctl10client'), 'X10')

WebUI.setText(findTestObject('Page_Login - Unit4 ERP/input_Password_ctl10password'), 'ERP7sdx2021%')

WebUI.click(findTestObject('Page_Login - Unit4 ERP/Login_Button'))

WebUI.click(findTestObject('Object Repository/Page_Homescreen menu - Unit4 ERP/div_Procurement'))

WebUI.click(findTestObject('Object Repository/Page_Homescreen menu - Unit4 ERP/div_Vendors'))

WebUI.switchToFrame(findTestObject('Page_Vendors/iFrame'), 60)

WebUI.switchToFrame(findTestObject('Page_Vendors/frame'), 60)

WebUI.click(findTestObject('Page_Vendors/New_button'))

WebUI.setText(findTestObject('Page_Vendors/Vender_name'), 'Alphabet')

WebUI.enhancedClick(findTestObject('Page_Vendors/Vender_group'))

WebUI.setText(findTestObject('Page_Vendors/Vender_group'), 'Employees')

WebUI.setText(findTestObject('Page_Vendors/External_Ref'), '1234567')

WebUI.setText(findTestObject('Page_Vendors/Short_name'), 'ABC')

WebUI.enhancedClick(findTestObject('Page_Vendors/Contact_Info_tab'))

WebUI.enhancedClick(findTestObject('Page_Vendors/Contact_Info_tab'))

WebUI.click(findTestObject('Page_Vendors/Contact_Info_tab_Add_button'))

WebUI.click(findTestObject('Page_Vendors/Save_button'))

WebUI.click(findTestObject('Page_Vendors/Update_rel_OK_Button'))

WebUI.click(findTestObject('Page_Vendors/Auto_numbering_OK_Button'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_Vendors/div_Vendors_u4-messageoverlay-warning-icon'), 0)

WebUI.closeBrowser()

