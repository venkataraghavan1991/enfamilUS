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

WebUI.navigateToUrl('https://www.icivics.org/')

WebUI.click(findTestObject('Object Repository/icivics/Page_Home  iCivics/span_SIGN IN'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Home  iCivics/a_Sign In'))

WebUI.click(findTestObject('Object Repository/icivics/Page_User Profile  iCivics/span_free account'))

WebUI.click(findTestObject('Object Repository/icivics/Page_User Profile  iCivics/a_play'))

WebUI.click(findTestObject('Object Repository/icivics/Page_User Profile  iCivics/a_Cast Your Vote'))

WebUI.mouseOver(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/img_Play Game_logo1'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/div_Play Game_template-wrap'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/p_Loading 90'))

WebUI.rightClick(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/p_Loading 90'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/i_Play Game_fas fa-play-circle'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.rightClick(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.rightClick(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.rightClick(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.rightClick(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.rightClick(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.rightClick(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.mouseOver(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/div_Cast Your Vote              VIEW LEADER_ec1e71'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.rightClick(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.click(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.rightClick(findTestObject('Object Repository/icivics/Page_Play Cast Your Vote - Voting Simulatio_090e31/canvas_Play Game_canvas'))

WebUI.closeBrowser()

