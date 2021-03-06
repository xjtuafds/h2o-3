package hex.schemas;

import water.Iced;
import water.api.API;
import water.api.schemas3.KeyV3;
import water.api.schemas3.SchemaV3;

public class Word2VecTransformV3 extends SchemaV3<Iced, Word2VecTransformV3> {
  @API(help="Source word2vec Model", required = true, direction = API.Direction.INPUT)
  public KeyV3.ModelKeyV3 model;
  @API(help = "Words Frame", required = true, direction = API.Direction.INPUT)
  public KeyV3.FrameKeyV3 words_frame;
  @API(help = "Word Vectors Frame", direction = API.Direction.OUTPUT)
  public KeyV3.FrameKeyV3 vectors_frame;
}