import org.apache.spark.ml.classification.NaiveBayes
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
//Imports required
import org.apache.spark.sql.SparkSession
  
   //Create the SparkSession object
   val spark = SparkSession.builder.appName("NaiveBayesExample").getOrCreate()

    
    // Load the data stored in LIBSVM format as a DataFrame.
    val data = spark.read.format("libsvm").load("sample_libsvm_data.txt")
   
    // Split the data into training and test sets (30% held out for testing)
    val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3), seed = 2229L)


    trainingData.filter($"features" > 0.0.toDouble).show()

    // Train a NaiveBayes model.
    val model = new NaiveBayes()
    model.fit(trainingData)

    // Select example rows to display.
    val predictions = model.transform(testData)
    predictions.show()

    // Select (prediction, true label) and compute test error
    val evaluator = new MulticlassClassificationEvaluator().setLabelCol("label").setPredictionCol("prediction").setMetricName("accuracy")
    val accuracy = evaluator.evaluate(predictions)
    
    println(s"Test set accuracy = $accuracy")
    

    