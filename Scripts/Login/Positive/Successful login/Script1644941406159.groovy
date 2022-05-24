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

WebUI.setText(findTestObject('Page_Login - Unit4 ERP/input_User name_ctl10name'), "Unit4")

WebUI.setText(findTestObject('Page_Login - Unit4 ERP/input_Client_ctl10client'), "X10")

WebUI.setText(findTestObject('Page_Login - Unit4 ERP/input_Password_ctl10password'), "ERP7sdx2021%")

WebUI.click(findTestObject('Page_Login - Unit4 ERP/Login_Button'))

WebUI.verifyElementPresent(findTestObject('Page_Menu - Unit4 ERP/img_PSO 3.1 Global_u4_applicationlogo-1020'), 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

