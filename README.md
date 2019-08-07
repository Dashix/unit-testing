Several defects were found in Calculator:
1) method cos() works incorrectly and returns sine instead of cosine
2) method tg() works incorrectly as counts tangent in a wrong way
3) method ctg() works incorrectly as counts cotangent in a wrong way

The following tests are failing because of the aforementioned defects:
1. CosCalcTest
2. TgCalcTest
3. CtgCalcTest


______________________________________________________________________

DataDriven approach (parametrization) is used in PowCalcTest in testng package

______________________________________________________________________

Parallel execution of tests is implemented in ParallelExecutionTest