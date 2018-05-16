# Proj_GradleTest

버전
안드로이드 스튜디오 3.1.2
유니티 5.6.4f1

Gradle 빌드시 큰 문제 3가지가 있었음
1. 안드로이드 스튜디오에서 Jar 생성시 release 폴더가 생성 안되는 문제
2. 유니티에서 빈프로젝트로 테스트 Gradle 빌드시 실패하는 문제
  - failed to find Build Tools revision 28.0.0
3. 1,2번이 해결되고 나서 유니티에서 빌드시 빌드 실패하는 문제

    	com.android.build.api.transform.TransformException:
	
	com.android.ide.common.process.ProcessException:
	
	java.util.concurrent.ExecutionException:
	
	com.android.dex.DexException: Multiple dex files
	
	define Lcom/hunter10/gradletest/BuildConfig; See the 
	
	Console for detail;
	

해결책
1. 안드로이드 스튜디오에서 그래들 버전이 문제였음. 3.1.0 -> 3.0.0 로 맞추니 잘됨. 빌드전 항상 Clean하는게 안전함.
2. 해당 버전의 안드로이드 SDK가 제대로 설치 안된 문제였음. 
   안드로이드 스튜디오에서 Tools -> SDK Manager -> SDK Tools 에서 Show Package Details 체크후 원하는 버전 설치하면 됨. 
3. 안드로이드에서 만든 Jar파일 안에 BuildConfig 파일이 포함되서 그런것인데 jar 파일을 zip파일로 돌리고 파일 빼고 다시 jar파일로 만들면 됨
